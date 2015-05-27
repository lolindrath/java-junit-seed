classpath = classes:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar

all: dependencies build test

build:
	javac -d classes -cp $(classpath) src/kata/Kata.java test/KataTest.java

test:
	java -cp $(classpath) org.junit.runner.JUnitCore test.KataTest

dependencies:
	which java javac

clean:
	$(RM) classes/**/*.class

.PHONY: all build dependencies test clean