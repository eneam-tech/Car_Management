package it.eneaminelli.car;

/**
 * Represents a generic car
 */
public interface Car {
    /**
     * Turns the car on
     */
    void turnOn();

    /**
     * Accelerates the car
     * @param amount the acceleration factor
     */
    void accelerate(double amount);

    /**
     * Get the type of the car
     * @return the car type
     */
    String getType();

    double getFuelLevel();
}
