package it.eneaminelli.fuel;

/**
 * Represents a fuel tank for gasoline powered cars
 */
public class FuelTank implements FuelSystem{
    
    private double fuelLevel;

    /**
     * Constructs a fuel tank with initial fuel level
     * 
     * @param initialLevel the starting fuel level.
     */
    public FuelTank(double initialLevel){
        this.fuelLevel = initialLevel;
    }

    @Override
    public void consume(double amount){
        fuelLevel = Math.max(fuelLevel - amount, 0);
    }

    @Override
    public double getLevel(){
        return fuelLevel;
    }
}
