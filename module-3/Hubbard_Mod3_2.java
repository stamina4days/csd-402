/**
 * Author: Prince Hubbard
 * Course: CSD402 - Java for Programmers
 * Assignment: Module 3.2 - Nested For Loops
 * Date: October 19, 2026
 * Purpose: Display a centered, seven-row powers-of-two pyramid with
 *          an aligned @ symbol at the end of every row.
 */
public class Hubbard_Mod3_2 {
    public static void main(String[] args) {
        final int ROWS = 7;

        // The outer loop controls the seven rows of the pyramid.
        for (int row = 0; row < ROWS; row++) {
            // Each missing number occupies one three-character field.
            for (int space = 0; space < ROWS - 1 - row; space++) {
                System.out.print("   ");
            }

            // Print ascending powers of two, including the row's peak.
            int value = 1;
            for (int column = 0; column <= row; column++) {
                System.out.printf("%3d", value);
                value *= 2;
            }

            // Print descending powers without repeating the peak.
            value /= 4;
            for (int column = 0; column < row; column++) {
                System.out.printf("%3d", value);
                value /= 2;
            }

            // Right-side padding keeps every @ in the same column.
            for (int space = 0; space < ROWS - 1 - row; space++) {
                System.out.print("   ");
            }
            System.out.println(" @");
        }
    }
}
