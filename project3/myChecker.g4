grammar myChecker;

options {
    language = Java;
}

@header {
    // import packages here.
    import java.util.HashMap;
    import java.util.Stack;
}


@members {
    static final boolean TRACEON = false;

    SymbolTable symtab = new SymbolTable();
    HashMap<String,Type> funs = new HashMap<String, Type>();

    public static class SymbolTable {
        Stack<HashMap<String,Type>> stack = new Stack<>();

        public void enterScope() {
            stack.push(new HashMap<>());
        }

        public void exitScope() {
            stack.pop();
        }

        public boolean put(String name, Type symbol) {
            HashMap<String, Type> current = stack.peek();
            if (current.containsKey(name)) return false;
            current.put(name, symbol);
            return true;
        }

        public Type get(String name) {
            for (int i = stack.size() - 1; i >= 0; i--) {
                if (stack.get(i).containsKey(name)) return stack.get(i).get(name);
            }
            return null;
        }

        public boolean containsKey(String name) {
            HashMap<String, Type> current = stack.peek();
            return current.containsKey(name);
        }
    }


    enum Type {
        Int,
        Float,
        Double,
        Char,
        Short,
        Void,
        IntPtr,
        FloatPtr,
        DoublePtr,
        CharPtr,
        ShortPtr,
        VoidPtr,
        Function,
        Boolean
    }

    static Type toPtr(Type t) {
        switch(t) {
            case Type.Int:
                return Type.IntPtr;
            case Type.Float:
                return Type.FloatPtr;
            case Type.Double:
                return Type.DoublePtr;
            case Type.Char:
                return Type.CharPtr;
            case Type.Short:
                return Type.ShortPtr;
            case Type.Void:
                return Type.VoidPtr;
            default:
                return t;
        }
    }

    static Type toElement(Type t) {
        switch(t) {
            case Type.IntPtr:
                return Type.Int;
            case Type.FloatPtr:
                return Type.Float;
            case Type.DoublePtr:
                return Type.Double;
            case Type.CharPtr:
                return Type.CharPtr;
            case Type.ShortPtr:
                return Type.Short;
            case Type.VoidPtr:
                return Type.Void;
            default:
                return t;
        }
    }
}

translationUnit
    @init {
        symtab.enterScope();
    }
    : (declaration | functionDefinition | ';')* EOF 
    { if (TRACEON) System.out.println("translationUnit: (declaration | functionDefinition | ';')* EOF"); }
    ;

/** declaration **/
declaration
    : 'const'? type ptr='*' pd=pointerDeclarator[$type.attr_t] initialization[$pd.id]? ';'
    | 'const'? type d=declarator[$type.attr_t] initialization[$d.id]? ';'
    { 
        if (TRACEON) System.out.println("declaration: 'const'? type '*'? declarator initialization? ';'"); 
    }
    ;

initialization[String id]
    : '=' (assignmentExpression {
        if($assignmentExpression.typ != symtab.get($id)) {
            // System.err.println($assignmentExpression.typ);
            // System.err.println(symtab.get($id));
            System.err.println("Error! line number: " + $assignmentExpression.start.getLine() + " imcompatible types.");
        }
    } | functionCall {
        if($functionCall.typ != symtab.get($id)) {
            System.err.println("Error! line number: " + $functionCall.start.getLine() + " imcompatible types.");
        }
    })
    { if (TRACEON) System.out.println("initialization: '=' (assignmentExpression | functionCall)"); }
    ;

type returns [Type attr_t]
    : Char { $attr_t = Type.Char; }
    | Int { $attr_t = Type.Int; }
    | Float { $attr_t = Type.Float; }
    | Double { $attr_t = Type.Double; }
    | Void { $attr_t = Type.Void; }
    | Short { $attr_t = Type.Short; }
    { if (TRACEON) System.out.println("type: Char | Int | Float | Double | Void"); }
    ;

pointerDeclarator[Type typ] returns [String id]
    : Identifier {
        if(symtab.containsKey($Identifier.text)) {
            System.err.println("Error: " + $Identifier.getLine() + ": Redeclared identifier.");
        } else {
            symtab.put($Identifier.text, toPtr($typ));
            $id = $Identifier.text;
        }
        if (TRACEON) System.out.println("declarator: Identifier");
    }
    ;

declarator[Type typ] returns [String id]
    : Identifier {
        if(symtab.containsKey($Identifier.text)) {
            System.err.println("Error: " + $Identifier.getLine() + ": Redeclared identifier.");
        } else {
            symtab.put($Identifier.text, $typ);
            $id = $Identifier.text;
        }
        if (TRACEON) System.out.println("declarator: Identifier");
    }

    // function declaration 
    | Identifier
    {
        if(symtab.containsKey($Identifier.text)) {
            System.err.println("Error: " + $Identifier.getLine() + ": Redeclared identifier.");
        } else if(funs.containsKey($Identifier)) {
            System.err.println("Error: " + $Identifier.getLine() + ": Redeclared function.");
        } else {
            symtab.put($Identifier.text, Type.Function);
            funs.put($Identifier.text, $typ);
            $id = $Identifier.text;
        }
    } '(' parameterList? ')' { 
        if (TRACEON) System.out.println("declarator: Identifier '(' parameterList? ')'"); 
    }

    // fixed length array
    | Identifier {
        if(symtab.containsKey($Identifier.text)) {
            System.err.println("Error: " + $Identifier.getLine() + ": Redeclared identifier.");
        } else {
            symtab.put($Identifier.text, toPtr($typ));
            $id = $Identifier.text;
        }
    } '[' IntegerConstant? ']' { 
        if (TRACEON) System.out.println("declarator: Identifier '[' IntegerConstant? ']'"); 
    }
    ;

// do not support '...'
parameterList
    : parameterDeclaration (',' parameterDeclaration)*
    { if (TRACEON) System.out.println("parameterList: parameterDeclaration (',' parameterDeclaration)*"); }
    ;

// do not support passing function pointer
// must have name even thought just declaration
parameterDeclaration
    : type '*'? Identifier {
        if(symtab.containsKey($Identifier.text)) {
            System.err.println("Error: " + $Identifier.getLine() + ": Redeclared identifier.");
        } else {
            symtab.put($Identifier.text, $type.attr_t);
        }
        if (TRACEON) System.out.println("parameterDeclaration: type '*'? Identifier");
    }
    | type Identifier '[' IntegerConstant ']' {
        if(symtab.containsKey($Identifier.text)) {
            System.err.println("Error: " + $Identifier.getLine() + ": Redeclared identifier.");
        } else {
            symtab.put($Identifier.text, toPtr($type.attr_t));
        }
        if (TRACEON) System.out.println("parameterDeclaration: type Identifier '[' IntegerConstant ']'");
    }
    // e.g. int arr[30] 
    ;

/** functionDefinition **/
functionDefinition
    @init {
        symtab.enterScope();
    }
    : type Identifier {
        if(symtab.containsKey($Identifier.text)) {
            if(symtab.get($Identifier.text) != Type.Function) {
                System.err.println("Error: " + $Identifier.getLine() + ": Redeclared identifier.");
            }
        } else {
            symtab.put($Identifier.text, Type.Function);
            funs.put($Identifier.text, $type.attr_t);
        }
    } '(' parameterList? ')' block[false]
    {
        symtab.exitScope();
        if (TRACEON) System.out.println("functionDefinition: type Identifier '(' parameterList? ')' block");
    }
    ;

block[boolean newSymtab]
    @init {
        if($newSymtab) {
            symtab.enterScope();
        }
    }
    : '{' statement[true]* '}'
    {
        if($newSymtab) {
            symtab.exitScope();
        }
        if (TRACEON) System.out.println("block: '{' statement* '}'");
    }
    ;

/** statement **/
statement[boolean newSymtab]
    : block[newSymtab] { if (TRACEON) System.out.println("statement: block"); }
    | declaration { if (TRACEON) System.out.println("statement: declaration"); }
    | expression ';' { if (TRACEON) System.out.println("statement: expression ';'"); }
    | selection { if (TRACEON) System.out.println("statement: selection"); }
    | iteration { if (TRACEON) System.out.println("statement: iteration"); }
    | ('break' | 'continue' | 'return' expression?) ';' { if (TRACEON) System.out.println("statement: ('break' | 'continue' | 'return' expression?) ';'"); }
    | functionCall ';' { if (TRACEON) System.out.println("statement: functionCall ';'"); }
    ;

constant returns [Type typ]
    : IntegerConstant 
    {
        $typ = Type.Int;
        if (TRACEON) System.out.println("constant: IntegerConstant"); 
    }
    | FloatingConstant
    {
        $typ = Type.Float;
        if (TRACEON) System.out.println("constant: FloatingConstant"); 
    }
    | DoubleConstant
    {
        $typ = Type.Double;
        if (TRACEON) System.out.println("constant: DoubleConstant"); 
    }
    | CharacterConstant
    {
        $typ = Type.Char;
        if (TRACEON) System.out.println("constant: CharacterConstant"); 
    }
    ;

/** expression (precedence from high to low) **/
simpleExpression returns [Type typ]
    : Identifier {
        if(symtab.get($Identifier.text) != null) {
            $typ = symtab.get($Identifier.text);
        } else {
            System.err.println("Error! line number: " + $Identifier.getLine() + " variable not declared!");
        }
        if (TRACEON) System.out.println("simpleExpression: Identifier"); 
    }

    | constant 
    {
        $typ = $constant.typ;
        if (TRACEON) System.out.println("simpleExpression: constant"); 
    }

    | StringLiteral {
        $typ = Type.CharPtr;
        if (TRACEON) System.out.println("simpleExpression: StringLiteral"); 
    }

    | '(' expression ')'
    {
        $typ = $expression.typ;
        if (TRACEON) System.out.println("simpleExpression: '(' expression ')'");
    }
    ;

postfixExpression returns [Type typ]
    : simpleExpression {$typ = $simpleExpression.typ;}
    ('++' { $typ = $simpleExpression.typ; } | '--' { $typ = $simpleExpression.typ; } | '[' expression ']' { $typ = toElement($simpleExpression.typ); })?
    { if (TRACEON) System.out.println("postfixExpression: simpleExpression ('++' | '--' | '.' Identifier | '[' expression ']')*"); }
    ;

prefixExpression returns [Type typ]
    : ('++' | '--')? postfixExpression
    {
        $typ = $postfixExpression.typ;
        if (TRACEON) System.out.println("prefixExpression: ('++' | '--')? postfixExpression");
    }
    | unaryExpression
    {
        $typ = $unaryExpression.typ;
        if (TRACEON) System.out.println("prefixExpression: unaryExpression");
    }
    ;

unaryOperator
    : '+'
    | '-'
    | '~'
    | '!'
    { if (TRACEON) System.out.println("unaryOperator: '+' | '-' | '~' | '!'"); }
    ;

unaryExpression returns [Type typ]
    : '&' postfixExpression { $typ = toPtr($postfixExpression.typ); }
    | '*' postfixExpression { $typ = toElement($postfixExpression.typ); }
    | unaryOperator postfixExpression { $typ = $postfixExpression.typ; }
    { if (TRACEON) System.out.println("unaryExpression: unaryOperator* postfixExpression"); }
    ;

mulicativeExpression returns [Type typ]
    : p1=prefixExpression { $typ = $p1.typ; } 
    (('*' | '/' | '%') p2=prefixExpression {
        if($p1.typ != $p2.typ) {
            System.err.println("Error! line number: " + $p2.start.getLine() + " imcompatible types.");
        }
        $typ = $p1.typ;
    } )*
    { if (TRACEON) System.out.println("mulicativeExpression: prefixExpression (('*' | '/' | '%') prefixExpression)*"); }
    ;

additiveExpression returns [Type typ]
    : m1=mulicativeExpression {$typ = $m1.typ;}
    (('+' | '-') m2=mulicativeExpression {
        if($m1.typ != $m2.typ) {
            System.err.println("Error! line number: " + $m2.start.getLine() + " imcompatible types.");
        }
        $typ = $m1.typ;
    })*
    { if (TRACEON) System.out.println("additiveExpression: mulicativeExpression (('+' | '-') mulicativeExpression)*"); }
    ;

shiftExpression returns [Type typ]
    : a1=additiveExpression {$typ = $a1.typ;}
    (('<<' | '>>') a2=additiveExpression {
        if($a1.typ != $a2.typ) {
            System.err.println("Error! line number: " + $a2.start.getLine() + " imcompatible types.");
        } 
        $typ = $a1.typ;
    })*
    { if (TRACEON) System.out.println("shiftExpression: additiveExpression (('<<' | '>>') additiveExpression)*"); }
    ;

compareExpression returns [Type typ]
    : s1=shiftExpression {$typ = $s1.typ;}
    (('<' | '>' | '<=' | '>=') s2=shiftExpression {
        if($s1.typ != $s2.typ) {
            System.err.println("Error! line number: " + $s2.start.getLine() + " imcompatible types.");
        } 
        $typ = Type.Boolean;
    })*
    { if (TRACEON) System.out.println("compareExpression: shiftExpression (('<' | '>' | '<=' | '>=') shiftExpression)*"); }
    ;

equalityExpression returns [Type typ]
    : c1=compareExpression {$typ = $c1.typ;}
    (('==' | '!=') c2=compareExpression {
        if($c1.typ != $c2.typ) {
            System.err.println("Error! line number: " + $c2.start.getLine() + " imcompatible types.");
        } 
        $typ = Type.Boolean;
    })*
    { if (TRACEON) System.out.println("equalityExpression: compareExpression (('==' | '!=') compareExpression)*"); }
    ;

andExpression returns [Type typ]
    : e1=equalityExpression {$typ = $e1.typ;}
    ('&' e2=equalityExpression{
        if($e1.typ != $e2.typ) {
            System.err.println("Error! line number: " + $e2.start.getLine() + " imcompatible types.");
        } 
        $typ = $e1.typ;
    })*
    { if (TRACEON) System.out.println("andExpression: equalityExpression ('&' equalityExpression)*"); }
    ;

exclusiveOrExpression returns [Type typ]
    : a1=andExpression {$typ = $a1.typ;}
    ('^' a2=andExpression {
        if($a1.typ != $a2.typ) {
            System.err.println("Error! line number: " + $a2.start.getLine() + " imcompatible types.");
        } 
        $typ = $a1.typ;
    })*
    { if (TRACEON) System.out.println("exclusiveOrExpression: andExpression ('^' andExpression)*"); }
    ;

inclusiveOrExpression returns [Type typ]
    : e1=exclusiveOrExpression {$typ = $e1.typ;}
    ('|' e2=exclusiveOrExpression {
        if($e1.typ != $e2.typ) {
            System.err.println("Error! line number: " + $e2.start.getLine() + " imcompatible types.");
        } 
        $typ = $e1.typ;
    })*
    { if (TRACEON) System.out.println("inclusiveOrExpression: exclusiveOrExpression ('|' exclusiveOrExpression)*"); }
    ;

logicalAndExpression returns [Type typ]
    : i1=inclusiveOrExpression {$typ = $i1.typ;}
    ('&&' i2=inclusiveOrExpression {
        if($i1.typ != $i2.typ) {
            System.err.println("Error! line number: " + $i2.start.getLine() + " imcompatible types.");
        } 
        $typ = Type.Boolean;
    })*
    { if (TRACEON) System.out.println("logicalAndExpression: inclusiveOrExpression ('&&' inclusiveOrExpression)*"); }
    ;

logicalOrExpression returns [Type typ]
    : l1=logicalAndExpression {$typ = $l1.typ;}
    ('||' l2=logicalAndExpression {
        if($l1.typ != $l2.typ) {
            System.err.println("Error! line number: " + $l2.start.getLine() + " imcompatible types.");
        } 
        $typ = Type.Boolean;
    })*
    { if (TRACEON) System.out.println("logicalOrExpression: logicalAndExpression ('||' logicalAndExpression)*"); }
    ;

assignmentExpression returns [Type typ]
    : logicalOrExpression
    {
        $typ = $logicalOrExpression.typ;
        if (TRACEON) System.out.println("assignmentExpression: logicalOrExpression");
    }
    | p=prefixExpression assignmentOperator l=logicalOrExpression
    {
        if($p.typ != $l.typ) {
            System.err.println("Error! line number: " + $l.start.getLine() + " imcompatible types.");
        }
        $typ = $p.typ;
        if (TRACEON) System.out.println("assignmentExpression: prefixExpression assignmentOperator logicalOrExpression");
    }
    ;

assignmentOperator
    : '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' | '='
    { if (TRACEON) System.out.println("assignmentOperator: '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' | '='"); }
    ;

expression returns [Type typ]
    : a1=assignmentExpression {$typ = $a1.typ;}
    (',' a2=assignmentExpression {
        // return a2's value
        $typ = $a2.typ;
    })*
    { if (TRACEON) System.out.println("expression: assignmentExpression (',' assignmentExpression)*"); }
    ;

/** selection **/
selection
    : 'if' '(' expression {
        if($expression.typ != Type.Boolean) {
            System.err.println("Error! line number: " + $expression.start.getLine() + " if needs boolean expression.");
        } 
    } ')' statement[true] ('else' statement[true])? { if (TRACEON) System.out.println("selection: 'if' '(' expression ')' statement ('else' statement)?"); }
    | 'switch' '(' expression ')' '{' caseStatement* defaultStatement? '}' { if (TRACEON) System.out.println("selection: 'switch' '(' expression ')' '{' caseStatement* defaultStatement? '}'"); }
    ;

caseStatement
    : 'case' constant ':' statement[true]*
    { if (TRACEON) System.out.println("caseStatement: 'case' Constant ':' statement*"); }
    ;

defaultStatement
    : 'default' ':' statement[true]
    { if (TRACEON) System.out.println("defaultStatement: 'default' ':' statement"); }
    ;

/** iteration **/
iteration
    : 'while' '(' expression {
        if($expression.typ != Type.Boolean) {
            System.err.println("Error! line number: " + $expression.start.getLine() + " while needs boolean expression.");
        }
    } ')' statement[true] { if (TRACEON) System.out.println("iteration: 'while' '(' expression ')' statement"); }
    | 'do' statement[true] 'while' '(' expression {
        if($expression.typ != Type.Boolean) {
            System.err.println("Error! line number: " + $expression.start.getLine() + " do while needs boolean expression.");
        }
    } ')' ';' { if (TRACEON) System.out.println("iteration: 'do' statement 'while' '(' expression ')' ';'"); }
    | 'for' '(' {
        symtab.enterScope();
    }
    forCondition ')' statement[false] {
        symtab.exitScope();
        if (TRACEON) System.out.println("iteration: 'for' '(' forCondition ')' statement");
    }
    ;

// do not support initialize with declaration, 
forCondition
    : (forDeclaration | expression?) ';' expression? {
        if($expression.typ != Type.Boolean) {
            System.err.println("Error! line number: " + $expression.start.getLine() + " for needs boolean expression.");
        }
    } ';' expression?
    { if (TRACEON) System.out.println("forCondition: (forDeclaration | expression?) ';' expression* ';' expression*"); }
    ;

forDeclaration
    : type ptr='*' pd=pointerDeclarator[$type.attr_t] initialization[$pd.id]?
    | type d=declarator[$type.attr_t] initialization[$d.id]?
    { if (TRACEON) System.out.println("forDeclaration: type '*'? declarator initialization?"); }
    ;

/** limited function support **/
functionCall returns [Type typ]
    : printf {
        $typ = Type.Int;
        if (TRACEON) System.out.println("functionCall: printf");
    }
    | scanf {
        $typ = Type.Int;
        if (TRACEON) System.out.println("functionCall: scanf");
    }
    | malloc {
        $typ = Type.VoidPtr;
        if (TRACEON) System.out.println("functionCall: malloc");
    }
    | free {
        $typ = Type.Void;
        if (TRACEON) System.out.println("functionCall: free");
    }
    | customerFunction {
        $typ = $customerFunction.typ;
        if (TRACEON) System.out.println("functionCall: customerFunction");
    }
    ;

printf
    : 'printf' '(' StringLiteral parameter* ')'
    { if (TRACEON) System.out.println("printf: 'printf' '(' StringLiteral parameter* ')'"); }
    ;

scanf
    : 'scanf' '(' StringLiteral parameter* ')'
    { if (TRACEON) System.out.println("scanf: 'scanf' '(' StringLiteral parameter* ')'"); }
    ;

malloc
    : 'malloc' '(' expression ')'
    { if (TRACEON) System.out.println("malloc: 'malloc' '(' expression ')'"); }
    ;

free
    : 'free' '(' expression ')'
    { if (TRACEON) System.out.println("free: 'free' '(' expression ')'"); }
    ;

customerFunction returns [Type typ]
    : Identifier '(' generalParameter? ')'
    {
        if(funs.containsKey($Identifier.text)) {
            $typ = funs.get($Identifier.text);
        } else {
            System.err.println("Error! line number: " + $Identifier.getLine() + " function not declared!");
        }
        if (TRACEON) System.out.println("customerFunction: Identifier '(' generalParameter? ')'");
    }
    ;

parameter
    : ',' expression
    { if (TRACEON) System.out.println("parameter: ',' expression"); }
    ;

generalParameter
    : expression parameter*
    { if (TRACEON) System.out.println("generalParameter: expression parameter*"); }
    ;

// keywork
Break
    : 'break'
    ;

Case
    : 'case'
    ;

Char
    : 'char'
    ;

Const
    : 'const'
    ;

Continue
    : 'continue'
    ;

Default
    : 'default'
    ;

Do
    : 'do'
    ;

Double
    : 'double'
    ;

Else
    : 'else'
    ;

Float
    : 'float'
    ;

For
    : 'for'
    ;

If
    : 'if'
    ;

Int
    : 'int'
    ;

Return
    : 'return'
    ;

Short
    : 'short'
    ;

Switch
    : 'switch'
    ;

Void
    : 'void'
    ;

While
    : 'while'
    ;

// limited function support
Printf
    : 'printf'
    ;

Scanf
    : 'scanf'
    ;

Malloc
    : 'malloc'
    ;

Free
    : 'free'
    ;

// punctuation
LeftParen
    : '('
    ;

RightParen
    : ')'
    ;

LeftBracket
    : '['
    ;

RightBracket
    : ']'
    ;

LeftBrace
    : '{'
    ;

RightBrace
    : '}'
    ;

Dot
    : '.'
    ;

Semi
    : ';'
    ;

Comma
    : ','
    ;

Colon
    : ':'
    ;

// compare
Less
    : '<'
    ;

LessEqual
    : '<='
    ;

Greater
    : '>'
    ;

GreaterEqual
    : '>='
    ;

// operator
LeftShift
    : '<<'
    ;

RightShift
    : '>>'
    ;

Plus
    : '+'
    ;

PlusPlus
    : '++'
    ;

Minus
    : '-'
    ;

MinusMinus
    : '--'
    ;

Star
    : '*'
    ;

Div
    : '/'
    ;

Mod
    : '%'
    ;

And
    : '&'
    ;

Or
    : '|'
    ;

AndAnd
    : '&&'
    ;

OrOr
    : '||'
    ;

Caret
    : '^'
    ;

Not
    : '!'
    ;

Tilde
    : '~'
    ;

Assign
    : '='
    ;

// '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
StarAssign
    : '*='
    ;

DivAssign
    : '/='
    ;

ModAssign
    : '%='
    ;

PlusAssign
    : '+='
    ;

MinusAssign
    : '-='
    ;

LeftShiftAssign
    : '<<='
    ;

RightShiftAssign
    : '>>='
    ;

AndAssign
    : '&='
    ;

XorAssign
    : '^='
    ;

OrAssign
    : '|='
    ;

Equal
    : '=='
    ;

NotEqual
    : '!='
    ;

Identifier
    : IdentifierNondigit (IdentifierNondigit | Digit)*
    ;

fragment IdentifierNondigit
    : Nondigit
    ;

fragment Nondigit
    : [a-zA-Z_]
    ;

fragment Digit
    : [0-9]
    ;

IntegerConstant
    : DecimalConstant
    | BinaryConstant
    ;

fragment BinaryConstant
    : '0' [bB] [0-1]+
    ;

fragment DecimalConstant
    : NonzeroDigit Digit*
    | '0'
    ;

fragment NonzeroDigit
    : [1-9]
    ;

FloatingConstant
    : DecimalFloatingConstant
    ;

DoubleConstant
    : FractionalConstant ExponentPart?
    | DigitSequence ExponentPart
    ;

fragment DecimalFloatingConstant
    : FractionalConstant ExponentPart? FloatingSuffix
    | DigitSequence ExponentPart FloatingSuffix
    ;


fragment FractionalConstant
    : DigitSequence? '.' DigitSequence
    | DigitSequence '.'
    ;

fragment ExponentPart
    : [eE] Sign? DigitSequence
    ;

fragment Sign
    : [+-]
    ;

fragment DigitSequence
    : Digit+
    ;

fragment FloatingSuffix
    : [fF]
    ;

// char and string literal
CharacterConstant
    : '\'' CChar '\''
    ;

fragment CChar
    : ~['\\\r\n]
    | EscapeSequence
    ;

fragment EscapeSequence
    : SimpleEscapeSequence
    ;

fragment SimpleEscapeSequence
    : '\\' ['"?abfnrtv\\]
    ;

StringLiteral
    : '"' SCharSequence? '"'
    ;


fragment SCharSequence
    : SChar+
    ;

fragment SChar
    : ~["\\\r\n]
    | EscapeSequence
    | '\\\n'   // Added line
    | '\\\r\n' // Added line
    ;

// ignore
Directive
    : '#' ~ [\n]* -> skip
    ;

Whitespace
    : [ \t]+ -> skip
    ;

Newline
    : ('\r' '\n'? | '\n')  -> skip
    ;

BlockComment
    : '/*' .*? '*/'  -> skip
    ;

LineComment
    : '//' ~[\r\n]*  -> skip
    ;