import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Prince Hubbard
 * Course: CSD402 Java for Programmers
 * Assignment: Module 9.2 - Program 1
 * Displays strings and handles an invalid user-selected index.
 */
public class PrinceArrayListExceptionTest {
    /** @param args command-line arguments (not used) */
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList(
                "Red", "Orange", "Yellow", "Green", "Blue",
                "Purple", "Pink", "White", "Black", "Gray"));

        System.out.println("Available elements (indexes 0 through 9):");
        int index = 0;
        for (String color : colors) {
            System.out.println(index + ": " + color);
            index++;
        }

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the index of the element to see again: ");
            String selection = input.nextLine();

            try {
                // parseInt returns int; assigning it to Integer autoboxes it.
                Integer selectedIndex = Integer.parseInt(selection.trim());
                // get expects int, so selectedIndex is automatically unboxed.
                System.out.println("Selected element: " + colors.get(selectedIndex));
            } catch (IndexOutOfBoundsException exception) {
                System.out.println("Exception thrown: Out of Bounds");
            } catch (NumberFormatException exception) {
                System.out.println("Exception thrown: Out of Bounds");
                System.out.println("Please enter a whole-number index from 0 through 9.");
            }
        }
    }
}
