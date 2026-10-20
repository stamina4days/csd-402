/*
 * Name: Prince Hubbard
 * Course: CSD 402 Java for Programmers
 * Assignment: Module 2.2 Rock-Paper-Scissors
 * Date: October 19, 2026
 * Purpose: Play one round of Rock-Paper-Scissors against a random
 *          computer selection and display both choices and the result.
 */

import java.util.Random;
import java.util.Scanner;

public class HubbardMod2_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // nextInt(3) produces 0, 1, or 2; adding 1 gives 1, 2, or 3.
        int computerChoice = random.nextInt(3) + 1;

        System.out.println("Rock-Paper-Scissors");
        System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
        System.out.print("Enter your selection (1, 2, or 3): ");

        // Keep prompting until the user enters a valid whole-number choice.
        while (true) {
            if (input.hasNextInt()) {
                int userChoice = input.nextInt();

                if (userChoice >= 1 && userChoice <= 3) {
                    System.out.println();
                    System.out.println("Computer selected: " + selectionName(computerChoice));
                    System.out.println("You selected: " + selectionName(userChoice));
                    System.out.println(determineResult(userChoice, computerChoice));
                    break;
                }
            } else {
                input.next(); // Discard a token that is not an integer.
            }
            System.out.print("Invalid selection. Enter 1, 2, or 3: ");
        }

        input.close();
    }

    // Convert the numeric choice into a readable selection.
    public static String selectionName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid selection";
        }
    }

    // Check ties first, then the three combinations in which the user wins.
    public static String determineResult(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "Result: It's a tie!";
        } else if ((userChoice == 1 && computerChoice == 3)
                || (userChoice == 2 && computerChoice == 1)
                || (userChoice == 3 && computerChoice == 2)) {
            return "Result: You win!";
        } else {
            return "Result: The computer wins!";
        }
    }
}
