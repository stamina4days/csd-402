import java.util.Arrays;

/**
 * Author: Prince Hubbard
 * Course: CSD402 Java for Programmers
 * Assignment: Module 5.2 - Multi-Dimensional Arrays
 * Finds the largest and smallest elements in int and double arrays.
 * Locations use zero-based [row, column] indexes. Ties keep the first
 * occurrence in row order. Input must contain at least one element;
 * rows must be non-null and non-empty. Double values must not be NaN.
 */
public class HubbardModule5 {
    /** Demonstrates all four overloaded methods. */
    public static void main(String[] args) {
        int[][] integers = {{12, -4, 7}, {25, 3, 18}, {9, 0, -12}};
        double[][] decimals = {{2.5, -3.7, 8.2}, {14.6, 0.5, -9.8}, {6.4, 11.1, 3.3}};

        System.out.println("Integer array:");
        for (int[] row : integers) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Largest location: " + Arrays.toString(locateLargest(integers)));
        System.out.println("Smallest location: " + Arrays.toString(locateSmallest(integers)));

        System.out.println("\nDouble array:");
        for (double[] row : decimals) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Largest location: " + Arrays.toString(locateLargest(decimals)));
        System.out.println("Smallest location: " + Arrays.toString(locateSmallest(decimals)));
        System.out.println("\nLocations use zero-based [row, column] indexes.");
    }

    /**
     * Finds the largest value in a two-dimensional double array.
     * @param arrayParam a non-empty array with non-null, non-empty rows
     * @return the first matching location as [row, column]
     */
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double best = arrayParam[0][0];

        // Visit every element; strict comparison preserves the first tie.
        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > best) {
                    best = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }
        return location;
    }

    /**
     * Finds the largest value in a two-dimensional int array.
     * @param arrayParam a non-empty array with non-null, non-empty rows
     * @return the first matching location as [row, column]
     */
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int best = arrayParam[0][0];

        // Visit every element; strict comparison preserves the first tie.
        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] > best) {
                    best = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }
        return location;
    }

    /**
     * Finds the smallest value in a two-dimensional double array.
     * @param arrayParam a non-empty array with non-null, non-empty rows
     * @return the first matching location as [row, column]
     */
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double best = arrayParam[0][0];

        // Visit every element; strict comparison preserves the first tie.
        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < best) {
                    best = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }
        return location;
    }

    /**
     * Finds the smallest value in a two-dimensional int array.
     * @param arrayParam a non-empty array with non-null, non-empty rows
     * @return the first matching location as [row, column]
     */
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int best = arrayParam[0][0];

        // Visit every element; strict comparison preserves the first tie.
        for (int row = 0; row < arrayParam.length; row++) {
            for (int column = 0; column < arrayParam[row].length; column++) {
                if (arrayParam[row][column] < best) {
                    best = arrayParam[row][column];
                    location[0] = row;
                    location[1] = column;
                }
            }
        }
        return location;
    }
}
