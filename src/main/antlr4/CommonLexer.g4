lexer grammar CommonLexer;

// ********** common rules **********

COLON           : ':' ;
SEMICOLON       : ';' ;
COMMA           : ',' ;
DOT             : '.' ;
DASH            : '-' ;
SLASH           : '/' ;
BACK_SLASH      : '\\';
PLUS            : '+' ;
OPEN_PARENTESES : '(' ;
CLOSE_PARENTESES: ')' ;
SINGLE_QUOTE    : '\'' ;
DOUBLE_QUOTE    : '\"' ;
OPEN_TAG        : '<' ;
CLOSE_TAG       : '>' ;
EQUAL           : '=' ;
PIPE            : '|' ;
UNDERSCORE      : '_' ;
ASTERISK        : '*' ;
AT_SIGN         : '@' ;
QUESTION_MARK   : '?' ;
EXCLAMATION_MARK: '!' ;
DOLLAR          : '$' ;
PERCENT         : '%' ;
NEGATION        : '~' ;

FOUR_DIGIT      : DIGIT DIGIT DIGIT DIGIT ;
TWO_DIGIT       : DIGIT DIGIT ;

INT             : DIGIT+ ;
DIGIT           : [0-9] ;
ALPHABET        : [a-zA-Z]+ ;
ALPHANUMERIC    : [a-zA-Z0-9]+ ;
TEXT            : ALPHANUMERIC ;
GENERAL_SYMBOL  : COLON | SEMICOLON | COMMA | DOT | DASH | SLASH | BACK_SLASH | PLUS | OPEN_PARENTESES | CLOSE_PARENTESES
                | SINGLE_QUOTE | DOUBLE_QUOTE | OPEN_TAG | CLOSE_TAG | EQUAL | PIPE | UNDERSCORE | ASTERISK | AT_SIGN
                | QUESTION_MARK | EXCLAMATION_MARK | DOLLAR | PERCENT | NEGATION
                ;
WS              : [ \n\r\t]+ -> skip ;
