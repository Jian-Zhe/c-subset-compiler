JAVAC = javac
JAVA = java
CP = ../antlr4-4.13.2-complete.jar:.
SRC = $(wildcard *.java)
CLASS = $(SRC:.java=.class)

all: antlr compile run

antlr: mylexer.g4
	antlr4 mylexer.g4

compile: $(CLASS)

%.class: %.java
	$(JAVAC) -cp $(CP) $<

run: $(CLASS)
	$(JAVA) -cp $(CP) testLexer testLiteral.c

clean:
	rm -f *.class
