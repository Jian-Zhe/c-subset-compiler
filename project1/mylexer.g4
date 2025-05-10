lexer grammar mylexer;

options {
    language = Java;
}

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

Struct
    : 'struct'
    ;

Switch
    : 'switch'
    ;

Union
    : 'union'
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

fragment IntegerConstant
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
    : ('\r' '\n'? | '\n') -> skip
    ;

BlockComment
    : '/*' .*? '*/' -> skip
    ;

LineComment
    : '//' ~[\r\n]* -> skip
    ;