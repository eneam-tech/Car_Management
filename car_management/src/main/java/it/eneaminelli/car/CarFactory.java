package it.eneaminelli.car;

import it.eneaminelli.fuel.Accelerator;

public class CarFactory {
    public static Car createCar(CarType type, Accelerator accelerator) {
        switch (type) {
            case ELECTRIC:
                return new ElectricCar.Builder().withAccelerator(accelerator).build();
            case SUV:
                return new SUV.Builder().withAccelerator(accelerator).build();     
            case LUXURY:
                return new LuxuryCar.Builder().withAccelerator(accelerator).build();
            default:
                throw new IllegalArgumentException("Unknown car type: " + type.name());
        }
    }
}
