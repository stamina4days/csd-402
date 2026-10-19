/*
 * Name: Prince Hubbard
 * Course: CSD 402 Java for Programmers
 * Assignment: Module 1.3 Programming Assignment
 * Date: October 19, 2026
 * Purpose: Calculate the energy needed to heat water using its mass
 *          in kilograms and initial and final temperatures in Celsius.
 */

import java.util.Scanner;

public class HubbardMod1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the mass and temperatures as decimal values.
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Water's specific heat capacity is 4184 joules per kilogram per degree Celsius.
        double energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("The energy needed to heat the water is %.2f Joules.%n", energy);

        input.close();
    }
}
