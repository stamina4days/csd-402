import java.util.ArrayList;
import java.util.Collection;

/**
 * Author: Prince Hubbard
 * Course: CSD402 Java for Programmers
 * Assignment: Module 7.2 - Oriented Class and Thinking
 * Demonstrates a collection of fans and displays their state using getters.
 */
public class UseFans {
    /** @param args command-line arguments (not used) */
    public static void main(String[] args) {
        ArrayList<Fan> fans = new ArrayList<>();
        fans.add(new Fan());
        fans.add(new Fan(Fan.SLOW, true, 8.0, "red"));
        fans.add(new Fan(Fan.MEDIUM, true, 9.0, "green"));
        fans.add(new Fan(Fan.FAST, true, 10.0, "blue"));

        System.out.println("Initial fan collection:");
        displayFans(fans);

        // Exercise every setter on every fan in the collection.
        for (Fan fan : fans) {
            fan.setSpeed((fan.getSpeed() + 1) % (Fan.FAST + 1));
            fan.setOn(!fan.getOn());
            fan.setRadius(fan.getRadius() + 1.0);
            fan.setColor("yellow");
        }

        System.out.println("\nCollection after updating every fan:");
        displayFans(fans);

        System.out.println("\nDisplaying one fan directly:");
        displayFan(fans.get(0));
    }

    /**
     * Displays each fan in a collection without using toString().
     * @param fans the collection of Fan instances
     */
    public static void displayFans(Collection<Fan> fans) {
        int number = 1;
        for (Fan fan : fans) {
            System.out.print("Fan " + number + ": ");
            displayFan(fan);
            number++;
        }
    }

    /**
     * Displays one fan through its getters, without converting the object
     * itself to a string. Speed is the selected setting, independent of power.
     * @param fan the Fan instance to display
     */
    public static void displayFan(Fan fan) {
        System.out.println("on=" + fan.getOn()
                + ", speed=" + fan.getSpeed()
                + ", radius=" + fan.getRadius()
                + ", color=" + fan.getColor());
    }
}
