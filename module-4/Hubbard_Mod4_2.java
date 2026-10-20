import java.util.Arrays;

/**
 * Author: Prince Hubbard
 * Course: CSD402 - Java for Programmers
 * Assignment: Module 4.2 - Overloaded Array Average Methods
 * Date: October 19, 2026
 * Purpose: Calculate and display averages for four numeric array types.
 * Integer-returning methods discard any fractional portion toward zero.
 * All input arrays must contain at least one element.
 */
public class Hubbard_Mod4_2 {
    public static void main(String[] args) {
        // Different lengths verify that each method uses its array's length.
        short[] shortValues = {10, 20, 31};
        int[] intValues = {12, 24, 36, 49};
        long[] longValues = {100L, 200L, 300L, 400L, 505L};
        double[] doubleValues = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        System.out.println("Array Averages Using Overloaded Methods");
        System.out.println("Integer averages discard the fractional portion.");
        System.out.println();

        System.out.println("short array (" + shortValues.length + " elements): "
                + Arrays.toString(shortValues));
        System.out.println("Average: " + average(shortValues));
        System.out.println();

        System.out.println("int array (" + intValues.length + " elements): "
                + Arrays.toString(intValues));
        System.out.println("Average: " + average(intValues));
        System.out.println();

        System.out.println("long array (" + longValues.length + " elements): "
                + Arrays.toString(longValues));
        System.out.println("Average: " + average(longValues));
        System.out.println();

        System.out.println("double array (" + doubleValues.length + " elements): "
                + Arrays.toString(doubleValues));
        System.out.println("Average: " + average(doubleValues));
    }

    /**
     * Returns the integer average of a nonempty short array.
     * A long accumulator prevents overflow when adding short values.
     * @param array the input values
     * @return the average, truncated toward zero
     */
    public static short average(short[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
        long sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    /**
     * Returns the integer average of a nonempty int array.
     * A long accumulator prevents overflow when adding int values.
     * @param array the input values
     * @return the average, truncated toward zero
     */
    public static int average(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (int) (sum / array.length);
    }

    /**
     * Returns the integer average of a nonempty long array.
     * The sum of the supplied values must fit in a long.
     * @param array the input values
     * @return the average, truncated toward zero
     */
    public static long average(long[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    /**
     * Returns the floating-point average of a nonempty double array.
     * @param array the input values
     * @return the average, retaining a fractional portion
     */
    public static double average(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }
}
