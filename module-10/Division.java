/*
 * Name: Prince Hubbard
 * Course: CSD402 - Java for Programmers
 * Assignment: Module 10.2 - Abstract Classes and Interfaces
 * Date: October 20, 2026
 * File: Division.java
 * Purpose: Define the shared fields and abstract behavior for company divisions.
 */

public abstract class Division {
    private final String divisionName;
    private final String accountNumber;

    /**
     * Initializes the information required by every division.
     * @param divisionName the company's division name
     * @param accountNumber the division's account identifier
     */
    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    /** @return the division name */
    public String getDivisionName() {
        return divisionName;
    }

    /** @return the account number, including any leading zeros */
    public String getAccountNumber() {
        return accountNumber;
    }

    /** Displays division information using the subclass implementation. */
    public abstract void display();
}
