package it.eneaminelli;

import it.eneaminelli.car.Car;

public class CarFacade {
    private Car car;

    public CarFacade(Car car){
        this.car = car;
    }

    public void startCar(){
        System.out.println("Initializing the car...");
        car.turnOn();
        System.out.println("Car " + car.getType() + " has started.");
    }
}
