package it.eneaminelli.fuel;
/**
 * Represents a fuel system that supplies a car.
 * This interface decouples the accelerator from the energy source 
 */

public interface FuelSystem {
    /**
     * Consumes energy
     * @param amount the amount of energy to consume.
     */
    void consume(double amount);

    /**
     * Gets the current energy level
     * @return the current energy level
     */

     double getLevel();
}
