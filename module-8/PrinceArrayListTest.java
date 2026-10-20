import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Prince Hubbard
 * Course: CSD402 Java for Programmers
 * Assignment: Module 8.2 - Inheritance and Polymorphism
 * Reads integers through a terminating zero and finds the largest value.
 */
public class PrinceArrayListTest {
    /** @param args command-line arguments (not used) */
    public static void main(String[] args) {
        runTests();

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter integers. Enter 0 to finish (0 is included).");

        while (true) {
            System.out.print("Enter an integer: ");
            if (!input.hasNext()) {
                break;
            }
            if (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
                continue;
            }
            int value = input.nextInt();
            numbers.add(value);
            if (value == 0) {
                break;
            }
        }

        System.out.println("Values entered: " + numbers);
        System.out.println("Largest value: " + max(numbers));
        input.close();
    }

    /**
     * Finds the largest integer without changing the supplied list.
     * @param list a non-null ArrayList containing only non-null Integers
     * @return the largest value, or 0 if the list is empty
     */
    @SuppressWarnings("rawtypes")
    public static Integer max(ArrayList list) {
        if (list.isEmpty()) {
            return 0;
        }

        // Start with an actual element so negative-only lists work too.
        Integer largest = (Integer) list.get(0);
        for (int index = 1; index < list.size(); index++) {
            Integer value = (Integer) list.get(index);
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

    /** Tests empty, negative, repeated, and mixed-value lists. */
    private static void runTests() {
        System.out.println("Built-in method tests:");
        testMax("Empty list", new ArrayList<Integer>(), 0);
        testMax("Only zero", new ArrayList<Integer>(Arrays.asList(0)), 0);
        testMax("Positive values", new ArrayList<Integer>(Arrays.asList(4, 12, 7, 0)), 12);
        testMax("Negative-only list", new ArrayList<Integer>(Arrays.asList(-8, -2, -5)), -2);
        testMax("Negatives with ending zero", new ArrayList<Integer>(Arrays.asList(-8, -2, 0)), 0);
        testMax("Repeated maximum", new ArrayList<Integer>(Arrays.asList(9, 9, 3, 0)), 9);
        testMax("Single negative", new ArrayList<Integer>(Arrays.asList(-6)), -6);
    }

    /**
     * Checks an expected result and reports a failure immediately.
     * @param label description of the test case
     * @param values integers to test
     * @param expected expected largest value
     */
    private static void testMax(String label, ArrayList<Integer> values, int expected) {
        Integer actual = max(values);
        if (actual.intValue() != expected) {
            throw new AssertionError(label + ": expected " + expected + ", received " + actual);
        }
        System.out.println("PASS - " + label + ": " + values + " -> " + actual);
    }
}
