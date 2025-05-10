antlr4 mylexer.g4
javac -cp ../antlr4-4.13.2-complete.jar:. mylexer.java
javac -cp ../antlr4-4.13.2-complete.jar:. testLexer.java

java -cp ../antlr4-4.13.2-complete.jar:. testLexer testLiteral.c > output.txt