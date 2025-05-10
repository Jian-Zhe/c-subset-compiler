JAVAC = javac
JAVA = java
CP = ./antlr4-4.13.2-complete.jar:.
SRC = $(wildcard *.java)
CLASS = $(SRC:.java=.class)

all: antlr compile

antlr: myparser.g4
	antlr4 myparser.g4

compile: $(CLASS)

%.class: %.java
	$(JAVAC) -cp $(CP) $<

run: $(CLASS)
	$(JAVA) -cp $(CP) testParser testLiteral.c

clean:
	rm -f *.class
	rm *.interp
	rm *.tokens
	rm myparser*.java
