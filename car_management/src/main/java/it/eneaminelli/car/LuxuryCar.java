package it.eneaminelli.car;

import it.eneaminelli.fuel.Accelerator;

/**
 * Represents a generic LuxuryCar
 */
public class LuxuryCar implements Car{
    private final Accelerator accelerator;
    private final CarType type;

    /**
     * Private constructor for the luxury car
     * @param builder the builder instructions
     */
    private LuxuryCar(Builder builder) {
        this.accelerator = builder.accelerator;
        this.type = CarType.LUXURY;
    }
    
    /**
     * Builder for luxury car
     */
    public static class Builder {
        private Accelerator accelerator;

        /**
         * Sets the accelerator for the luxury car
         * 
         * @param accelerator the accelerator to use
         * @return the builder instance
         */
        public Builder withAccelerator(Accelerator accelerator) {
            this.accelerator = accelerator;
            return this;
        }

        /**
         * Builds the luxury car instance
         * @return a new luxury car
         */
        public LuxuryCar build() {
            if(accelerator == null){
                throw new IllegalArgumentException("Accelerator must be provided.");
            }
            return new LuxuryCar(this);
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Luxury car " + type + " is turned on with elegance.");
    }

    @Override
    public void accelerate(double amount) {
        accelerator.accelerate(amount);
        System.out.println("Luxury car accelerating, fuel level: " + accelerator.getFuelLevel());
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
