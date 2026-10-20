/*
 * Name: Prince Hubbard
 * Course: CSD402 - Java for Programmers
 * Assignment: Module 10.2 - Abstract Classes and Interfaces
 * Date: October 20, 2026
 * File: DomesticDivision.java
 * Purpose: Represent a division located in a U.S. state.
 */

public class DomesticDivision extends Division {
    private final String state;

    /**
     * Initializes all domestic division fields.
     * @param divisionName the division name
     * @param accountNumber the account identifier
     * @param state the state where the division is located
     */
    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    /** Displays shared information along with the state. */
    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
        System.out.println();
    }
}
