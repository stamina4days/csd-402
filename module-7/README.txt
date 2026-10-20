Prince Hubbard
CSD402 Java for Programmers
Module 7.2 - Oriented Class and Thinking

Files:
Fan.java - Module 6 Fan class updated to use this for instance fields
           and instance method calls where applicable.
TestFan.java - Original Module 6 test code, retained unchanged.
UseFans.java - Module 7 collection and single-instance display tests.

From the folder containing all three Java source files, compile:
  javac Fan.java TestFan.java UseFans.java

Run the Module 7 program:
  java UseFans

Run the retained Module 6 tests:
  java TestFan

UseFans creates four fans, displays the collection, changes all four
mutable fields on every fan, and displays the updated collection.
It also calls the single-instance display method directly.
Both Module 7 display methods use getters instead of toString().
The original toString() remains in Fan for Module 6 compatibility.
Power and the selected speed are independent settings.
