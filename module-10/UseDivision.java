/*
 * Name: Prince Hubbard
 * Course: CSD402 - Java for Programmers
 * Assignment: Module 10.2 - Abstract Classes and Interfaces
 * Date: October 20, 2026
 * File: UseDivision.java
 * Purpose: Create and display two international and two domestic divisions.
 */

public class UseDivision {
    /**
     * Demonstrates constructors, inheritance, and overridden display methods.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Each constructor supplies every field required for that division.
        InternationalDivision internationalOne = new InternationalDivision(
                "European Operations", "001001", "Germany", "German");
        InternationalDivision internationalTwo = new InternationalDivision(
                "Pacific Operations", "001002", "Japan", "Japanese");
        DomesticDivision domesticOne = new DomesticDivision(
                "Central Operations", "002001", "Nebraska");
        DomesticDivision domesticTwo = new DomesticDivision(
                "Western Operations", "002002", "California");

        System.out.println("Company Division Information");
        System.out.println("============================");
        System.out.println();

        // A superclass array demonstrates polymorphism: each object's
        // subclass implementation of display() runs through this reference.
        Division[] divisions = {
            internationalOne, internationalTwo, domesticOne, domesticTwo
        };
        for (Division division : divisions) {
            division.display();
        }
    }
}
