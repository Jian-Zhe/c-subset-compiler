grammar myparser;

options {
    language = Java;
}

@members {
static final boolean TRACEON = true;
}

translationUnit
    : (declaration | functionDefinition | ';')* EOF 
    { if (TRACEON) System.out.println("translationUnit: (declaration | functionDefinition | ';')* EOF"); }
    ;

/** declaration **/
// do not support initializing struct
declaration
    : 'const'? type '*'? declarator initialization? ';'
    { if (TRACEON) System.out.println("declaration: 'const'? type '*'? declarator initialization? ';'"); }
    ;

initialization
    : '=' (assignmentExpression | functionCall)
    { if (TRACEON) System.out.println("initialization: '=' (assignmentExpression | functionCall)"); }
    ;

type
    : Char
    | Int
    | Float
    | Double
    | Void
    | Short
    { if (TRACEON) System.out.println("type: Char | Int | Float | Double | Void"); }
    ;

declarator
    : Identifier { if (TRACEON) System.out.println("declarator: Identifier"); }
    // function declaration 
    | Identifier '(' parameterList? ')' { if (TRACEON) System.out.println("declarator: Identifier '(' parameterList? ')'"); }
    // fixed length array
    | Identifier '[' IntegerConstant? ']' { if (TRACEON) System.out.println("declarator: Identifier '[' IntegerConstant? ']'"); }
    ;

// do not support '...'
parameterList
    : parameterDeclaration (',' parameterDeclaration)*
    { if (TRACEON) System.out.println("parameterList: parameterDeclaration (',' parameterDeclaration)*"); }
    ;

// do not support passing function pointer
// must have name even thought just declaration
parameterDeclaration
    : type '*'? Identifier { if (TRACEON) System.out.println("parameterDeclaration: type '*'? Identifier"); }
    | type Identifier '[' IntegerConstant ']' { if (TRACEON) System.out.println("parameterDeclaration: type Identifier '[' IntegerConstant ']'"); }
    // e.g. int arr[30] 
    ;

/** functionDefinition **/
functionDefinition
    : type Identifier '(' parameterList? ')' block
    { if (TRACEON) System.out.println("functionDefinition: type Identifier '(' parameterList? ')' block"); }
    ;

block
    : '{' statement* '}'
    { if (TRACEON) System.out.println("block: '{' statement* '}'"); }
    ;

/** statement **/
statement
    : block { if (TRACEON) System.out.println("statement: block"); }
    | declaration { if (TRACEON) System.out.println("statement: declaration"); }
    | expression ';' { if (TRACEON) System.out.println("statement: expression ';'"); }
    | selection { if (TRACEON) System.out.println("statement: selection"); }
    | iteration { if (TRACEON) System.out.println("statement: iteration"); }
    | ('break' | 'continue' | 'return' expression?) ';' { if (TRACEON) System.out.println("statement: ('break' | 'continue' | 'return' expression?) ';'"); }
    | functionCall ';' { if (TRACEON) System.out.println("statement: functionCall ';'"); }
    ;

/** expression (precedence from high to low) **/
simpleExpression
    : Identifier { if (TRACEON) System.out.println("simpleExpression: Identifier"); }
    | Constant { if (TRACEON) System.out.println("simpleExpression: Constant"); }
    | StringLiteral { if (TRACEON) System.out.println("simpleExpression: StringLiteral"); }
    | '(' expression ')' { if (TRACEON) System.out.println("simpleExpression: '(' expression ')'"); }
    ;

postfixExpression
    : simpleExpression ('++' | '--' | '.' Identifier | '[' expression ']')*
    { if (TRACEON) System.out.println("postfixExpression: simpleExpression ('++' | '--' | '.' Identifier | '[' expression ']')*"); }
    ;

prefixExpression
    : ('++' | '--')? postfixExpression { if (TRACEON) System.out.println("prefixExpression: ('++' | '--')? postfixExpression"); }
    | unaryExpression { if (TRACEON) System.out.println("prefixExpression: unaryExpression"); }
    ;

unaryOperator
    : '&'
    | '*'
    | '+'
    | '-'
    | '~'
    | '!'
    { if (TRACEON) System.out.println("unaryOperator: '&' | '*' | '+' | '-' | '~' | '!'"); }
    ;

unaryExpression
    : unaryOperator* postfixExpression
    { if (TRACEON) System.out.println("unaryExpression: unaryOperator* postfixExpression"); }
    ;

mulicativeExpression
    : prefixExpression (('*' | '/' | '%') prefixExpression)*
    { if (TRACEON) System.out.println("mulicativeExpression: prefixExpression (('*' | '/' | '%') prefixExpression)*"); }
    ;

additiveExpression
    : mulicativeExpression (('+' | '-') mulicativeExpression)*
    { if (TRACEON) System.out.println("additiveExpression: mulicativeExpression (('+' | '-') mulicativeExpression)*"); }
    ;

shiftExpression
    : additiveExpression (('<<' | '>>') additiveExpression)*
    { if (TRACEON) System.out.println("shiftExpression: additiveExpression (('<<' | '>>') additiveExpression)*"); }
    ;

compareExpression
    : shiftExpression (('<' | '>' | '<=' | '>=') shiftExpression)*
    { if (TRACEON) System.out.println("compareExpression: shiftExpression (('<' | '>' | '<=' | '>=') shiftExpression)*"); }
    ;

equalityExpression
    : compareExpression (('==' | '!=') compareExpression)*
    { if (TRACEON) System.out.println("equalityExpression: compareExpression (('==' | '!=') compareExpression)*"); }
    ;

andExpression
    : equalityExpression ('&' equalityExpression)*
    { if (TRACEON) System.out.println("andExpression: equalityExpression ('&' equalityExpression)*"); }
    ;

exclusiveOrExpression
    : andExpression ('^' andExpression)*
    { if (TRACEON) System.out.println("exclusiveOrExpression: andExpression ('^' andExpression)*"); }
    ;

inclusiveOrExpression
    : exclusiveOrExpression ('|' exclusiveOrExpression)*
    { if (TRACEON) System.out.println("inclusiveOrExpression: exclusiveOrExpression ('|' exclusiveOrExpression)*"); }
    ;

logicalAndExpression
    : inclusiveOrExpression ('&&' inclusiveOrExpression)*
    { if (TRACEON) System.out.println("logicalAndExpression: inclusiveOrExpression ('&&' inclusiveOrExpression)*"); }
    ;

logicalOrExpression
    : logicalAndExpression ('||' logicalAndExpression)*
    { if (TRACEON) System.out.println("logicalOrExpression: logicalAndExpression ('||' logicalAndExpression)*"); }
    ;

assignmentExpression
    : logicalOrExpression { if (TRACEON) System.out.println("assignmentExpression: logicalOrExpression"); }
    | prefixExpression assignmentOperator logicalOrExpression { if (TRACEON) System.out.println("assignmentExpression: prefixExpression assignmentOperator logicalOrExpression"); }
    ;

assignmentOperator
    : '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' | '='
    { if (TRACEON) System.out.println("assignmentOperator: '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' | '='"); }
    ;

expression
    : assignmentExpression (',' assignmentExpression)*
    { if (TRACEON) System.out.println("expression: assignmentExpression (',' assignmentExpression)*"); }
    ;

/** selection **/
selection
    : 'if' '(' expression ')' statement ('else' statement)? { if (TRACEON) System.out.println("selection: 'if' '(' expression ')' statement ('else' statement)?"); }
    | 'switch' '(' expression ')' '{' caseStatement* defaultStatement? '}' { if (TRACEON) System.out.println("selection: 'switch' '(' expression ')' '{' caseStatement* defaultStatement? '}'"); }
    ;

caseStatement
    : 'case' Constant ':' statement*
    { if (TRACEON) System.out.println("caseStatement: 'case' Constant ':' statement*"); }
    ;

defaultStatement
    : 'default' ':' statement
    { if (TRACEON) System.out.println("defaultStatement: 'default' ':' statement"); }
    ;

/** iteration **/
iteration
    : 'while' '(' expression ')' statement { if (TRACEON) System.out.println("iteration: 'while' '(' expression ')' statement"); }
    | 'do' statement 'while' '(' expression ')' ';' { if (TRACEON) System.out.println("iteration: 'do' statement 'while' '(' expression ')' ';'"); }
    | 'for' '(' forCondition ')' statement { if (TRACEON) System.out.println("iteration: 'for' '(' forCondition ')' statement"); }
    ;

// do not support initialize with declaration, 
forCondition
    : (forDeclaration | expression?) ';' expression* ';' expression*
    { if (TRACEON) System.out.println("forCondition: (forDeclaration | expression?) ';' expression* ';' expression*"); }
    ;

forDeclaration
    : type '*'? declarator initialization?
    { if (TRACEON) System.out.println("forDeclaration: type '*'? declarator initialization?"); }
    ;

/** limited function support **/
functionCall
    : printf { if (TRACEON) System.out.println("functionCall: printf"); }
    | scanf { if (TRACEON) System.out.println("functionCall: scanf"); }
    | malloc { if (TRACEON) System.out.println("functionCall: malloc"); }
    | free { if (TRACEON) System.out.println("functionCall: free"); }
    | customerFunction { if (TRACEON) System.out.println("functionCall: customerFunction"); }
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

customerFunction
    : Identifier '(' generalParameter? ')'
    { if (TRACEON) System.out.println("customerFunction: Identifier '(' generalParameter? ')'"); }
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

Constant
    : IntegerConstant
    | FloatingConstant
    | CharacterConstant
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

fragment FloatingConstant
    : DecimalFloatingConstant
    ;

fragment DecimalFloatingConstant
    : FractionalConstant ExponentPart? FloatingSuffix?
    | DigitSequence ExponentPart FloatingSuffix?
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
    : [flFL]
    ;

// char and string literal
fragment CharacterConstant
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