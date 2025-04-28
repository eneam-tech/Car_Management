package it.eneaminelli.car;


import it.eneaminelli.fuel.Accelerator;

public class SUV implements Car {

    private final Accelerator accelerator;
    private final CarType type;


    private SUV(Builder builder){
        this.type = CarType.SUV;
        this.accelerator = builder.accelerator;
    }

    public static class Builder{
        private Accelerator accelerator;

        public Builder withAccelerator(Accelerator accelerator){
            this.accelerator = accelerator;
            return this;
        }

        public SUV build() {
            if(accelerator == null) {
                throw new IllegalArgumentException("Accelerator must be provided.");
            }
            return new SUV(this);
        }
    }

    @Override
    public void turnOn() {
        System.out.println("SUV" + type + "is turned on with a roar.");
    }

    @Override
    public void accelerate(double amount) {
        accelerator.accelerate(amount);
        System.out.println("SUV accelerating, fuel level: " + accelerator.getFuelLevel());
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
