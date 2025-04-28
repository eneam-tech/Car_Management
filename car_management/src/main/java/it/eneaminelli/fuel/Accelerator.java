package it.eneaminelli.fuel;

/**
 * Represents the accelerator module of a car
 * This car makes use of the bridge pattern to ensure decoupling 
 * of accelerator and fuel system
 */
public class Accelerator {
    private FuelSystem fuelSystem;

    /**
     * Consutructs an accelerator object wwith the specified fuel system
     * 
     * @param fuelSystem the fuel system to use
     */
    public Accelerator(FuelSystem fuelSystem) {
        this.fuelSystem = fuelSystem;
    }
    
    /**
     * Accelerates car by consuming fuel
     * @param amount the amount of fuel to consume.
     */
    public void accelerate(double amount){
        fuelSystem.consume(amount);
    }

    /**
     * Gets the current fuel level
     * 
     * @return the updated fuel level
     */
    public double getFuelLevel(){
        return this.fuelSystem.getLevel();
    }
}
