Prince Hubbard
CSD402 Java for Programmers
Module 9.2 - Exception Handling and Text I/O

Compile from the folder containing both source files:
  javac PrinceArrayListExceptionTest.java PrinceFileIOTest.java

Program 1:
  java PrinceArrayListExceptionTest

Displays 10 strings using a for-each loop and asks for an index (0-9).
Examples: 4 displays Blue; 10 or -1 displays the Out of Bounds message.
Non-integer input is also caught. The input is read as a String.
Assigning the int returned by parseInt to Integer demonstrates autoboxing.
Passing that Integer to ArrayList.get(int) demonstrates auto-unboxing.

Program 2:
  java PrinceFileIOTest

Creates data.file in the current working folder if it is missing.
Each run appends 10 random integers from 0 through 99, separated by spaces.
The writer closes before the program reopens and displays the file.
Run twice to see the count grow from 10 to 20 in a fresh folder.
data.file is generated when the program runs; no pre-created file is needed.

GitHub repository: https://github.com/stamina4days/csd-402
