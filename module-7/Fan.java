/**
 * Author: Prince Hubbard
 * Course: CSD402 Java for Programmers
 * Assignment: Module 7.2 - Extended from Module 6.2
 * Represents a fan with adjustable speed, power, radius, and color.
 */
public class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /** Creates a stopped, powered-off, white fan with radius 6. */
    public Fan() {
        this(STOPPED, false, 6.0, "white");
    }

    /**
     * Creates a fan using the supplied settings.
     * @param speed speed constant from STOPPED through FAST
     * @param on whether the fan is powered on
     * @param radius radius of the fan
     * @param color color of the fan
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.setSpeed(speed);
        this.setOn(on);
        this.setRadius(radius);
        this.setColor(color);
    }

    /** @return the selected speed constant */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Sets the selected speed.
     * @param speed one of the four speed constants
     * @throws IllegalArgumentException if the speed is outside 0 through 3
     */
    public void setSpeed(int speed) {
        if (speed < STOPPED || speed > FAST) {
            throw new IllegalArgumentException("Speed must be between 0 and 3.");
        }
        this.speed = speed;
    }

    /** @return whether the fan is powered on */
    public boolean getOn() {
        return this.on;
    }

    /** @param on whether the fan should be powered on */
    public void setOn(boolean on) {
        this.on = on;
    }

    /** @return the fan radius */
    public double getRadius() {
        return this.radius;
    }

    /** @param radius the fan radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** @return the fan color */
    public String getColor() {
        return this.color;
    }

    /** @param color the fan color */
    public void setColor(String color) {
        this.color = color;
    }

    /** @return a description of the power, selected speed, radius, and color */
    @Override
    public String toString() {
        return "Fan [on=" + this.on + ", speed=" + this.speed
                + ", radius=" + this.radius + ", color=" + this.color + "]";
    }
}
