/*
 * Name: Prince Hubbard
 * Course: CSD402 - Java for Programmers
 * Assignment: Module 10.2 - Abstract Classes and Interfaces
 * Date: October 20, 2026
 * File: InternationalDivision.java
 * Purpose: Represent a division located in another country.
 */

public class InternationalDivision extends Division {
    private final String country;
    private final String language;

    /**
     * Initializes all international division fields.
     * @param divisionName the division name
     * @param accountNumber the account identifier
     * @param country the country where the division is located
     * @param language the language spoken at the division
     */
    public InternationalDivision(String divisionName, String accountNumber,
                                 String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    /** Displays shared information along with the country and language. */
    @Override
    public void display() {
        System.out.println("International Division");
        System.out.println("Division Name: " + getDivisionName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
