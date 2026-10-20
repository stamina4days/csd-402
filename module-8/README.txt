Prince Hubbard
CSD402 Java for Programmers
Module 8.2 - Inheritance and Polymorphism

Compile from the folder containing the source file:
  javac PrinceArrayListTest.java

Run:
  java PrinceArrayListTest

The program runs seven built-in tests, then asks for integers until 0
is entered. The terminating 0 is added to the ArrayList before it is
passed to max. Invalid input is rejected and the user is prompted again.

Example input: 4, 12, 7, 0
Values entered: [4, 12, 7, 0]
Largest value: 12

If only negative numbers are entered before the terminating zero, the
interactive result is 0 because zero belongs to the list. The method
also handles negative-only lists supplied directly and empty lists.

The raw ArrayList parameter in max matches the required signature:
public static Integer max(ArrayList list)
Its documented input is a non-null list of non-null Integer values.

GitHub repository: https://github.com/stamina4days/csd-402
