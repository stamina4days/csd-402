/**
 * Author: Prince Hubbard
 * Course: CSD402 Java for Programmers
 * Assignment: Module 6.2 - Objects and Classes
 * Demonstrates both Fan constructors, every getter and setter, and toString.
 */
public class TestFan {
    /** @param args command-line arguments (not used) */
    public static void main(String[] args) {
        Fan defaultFan = new Fan();
        Fan customFan = new Fan(Fan.FAST, true, 10.0, "blue");

        System.out.println("Speed constants: STOPPED=" + Fan.STOPPED
                + ", SLOW=" + Fan.SLOW + ", MEDIUM=" + Fan.MEDIUM
                + ", FAST=" + Fan.FAST);

        System.out.println("\nDefault constructor:");
        System.out.println(defaultFan.toString());
        displayGetters(defaultFan);

        System.out.println("\nArgument constructor:");
        System.out.println(customFan.toString());
        displayGetters(customFan);

        // Exercise all setters on the first instance.
        defaultFan.setSpeed(Fan.SLOW);
        defaultFan.setOn(true);
        defaultFan.setRadius(8.0);
        defaultFan.setColor("red");
        System.out.println("\nDefault fan after all four setters:");
        System.out.println(defaultFan.toString());
        displayGetters(defaultFan);

        defaultFan.setSpeed(Fan.MEDIUM);
        System.out.println("\nDefault fan changed to MEDIUM:");
        System.out.println(defaultFan.toString());

        // Changing one instance does not change the other instance.
        System.out.println("\nCustom fan remains unchanged:");
        System.out.println(customFan.toString());

        customFan.setSpeed(Fan.STOPPED);
        customFan.setOn(false);
        System.out.println("\nCustom fan stopped and turned off:");
        System.out.println(customFan.toString());
    }

    /** @param fan the fan whose getters will be demonstrated */
    private static void displayGetters(Fan fan) {
        System.out.println("getSpeed(): " + fan.getSpeed());
        System.out.println("getOn(): " + fan.getOn());
        System.out.println("getRadius(): " + fan.getRadius());
        System.out.println("getColor(): " + fan.getColor());
    }
}
