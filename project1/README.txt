生成lexer：antlr4 mylexer.g4

編譯lexer程式：
javac -cp ./antlr4-4.13.2-complete.jar:. mylexer.java
javac -cp ./antlr4-4.13.2-complete.jar:. testLexer.java

執行lexer程式：
java -cp ./antlr4-4.13.2-complete.jar:. testLexer testLiteral.c
