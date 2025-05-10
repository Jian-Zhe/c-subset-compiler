antlr4 myparser.g4
javac -cp ../antlr4-4.13.2-complete.jar:. myparserParser.java
javac -cp ../antlr4-4.13.2-complete.jar:. Test.java

java -cp ../antlr4-4.13.2-complete.jar:. Test ./test/test.c > output.txt