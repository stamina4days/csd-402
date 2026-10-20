Prince Hubbard
CSD402 Java for Programmers
Module 6.2 - Objects and Classes

Files:
Fan.java - Fan class with constants, fields, constructors, accessors,
           mutators, and toString().
TestFan.java - Demonstrates both constructors and every public method.

Compile from the folder containing both Java files:
  javac Fan.java TestFan.java

Run:
  java TestFan

Initial fan descriptions:
Fan [on=false, speed=0, radius=6.0, color=white]
Fan [on=true, speed=3, radius=10.0, color=blue]

The test also changes all four mutable fields, demonstrates MEDIUM,
shows the second instance is independent, and stops and powers off it.
Speed is a selected setting; the on field controls power independently.
