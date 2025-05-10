JAVAC = javac
JAVA = java
CP = ./antlr4-4.13.2-complete.jar:.
SRC = $(wildcard *.java)
CLASS = $(SRC:.java=.class)

all: antlr compile

antlr: myChecker.g4
	antlr4 myChecker.g4

compile: $(CLASS)

%.class: %.java
	$(JAVAC) -cp $(CP) $<

run: $(CLASS)
	$(JAVA) -cp $(CP) myChecker_test testFunction.c

clean:
	rm -f *.class
	rm *.interp
	rm *.tokens
	find . -maxdepth 1 -name 'myChecker*.java' ! -name 'myChecker_test.java' -exec rm {} +
