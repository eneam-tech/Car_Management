package it.eneaminelli.car;

import it.eneaminelli.fuel.Accelerator;

/**
 * Represents a generic ElectricCar
 */
public class ElectricCar implements Car{
    private final Accelerator accelerator;
    private final CarType type;

    /**
     * Private constructor for the electric car
     * @param builder the builder instructions
     */
    private ElectricCar(Builder builder) {
        this.accelerator = builder.accelerator;
        this.type = CarType.ELECTRIC;
    }
    
    /**
     * Builder for electric car
     */
    public static class Builder {
        private Accelerator accelerator;

        /**
         * Sets the accelerator for the electric car
         * 
         * @param accelerator the accelerator to use
         * @return the builder instance
         */
        public Builder withAccelerator(Accelerator accelerator) {
            this.accelerator = accelerator;
            return this;
        }

        /**
         * Builds the electroc car instance
         * @return a new electric car
         */
        public ElectricCar build() {
            if(accelerator == null){
                throw new IllegalArgumentException("Accelerator must be provided.");
            }
            return new ElectricCar(this);
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Electric car " + type + " is turned on in silence.");
    }

    @Override
    public void accelerate(double amount) {
        accelerator.accelerate(amount);
        System.out.println("Electric car accelerating, battery level: " + accelerator.getFuelLevel());
    }

    @Override
    public String getType() {
        return this.type.name();
    }

    @Override
    public double getFuelLevel() {
        return this.accelerator.getFuelLevel();
    }
    
    
}
