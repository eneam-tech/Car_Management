package it.eneaminelli.fuel;

/**
 * Represents an electric battery
 */
public class ElectricBattery implements FuelSystem{
    private double chargeLevel;
    
    /**
     * Constructs an electric battery with an initial charge level
     * @param initialCharge the starting charge level
     */

    public ElectricBattery(double initialCharge) {
        this.chargeLevel = initialCharge;
    }

    @Override
    public void consume(double amount){
        chargeLevel = Math.max(chargeLevel - amount, 0);
    }

    @Override
    public double getLevel(){
        return chargeLevel;
    }
}
