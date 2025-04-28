package it.eneaminelli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import it.eneaminelli.car.Car;
import it.eneaminelli.car.CarFactory;
import it.eneaminelli.car.CarType;
import it.eneaminelli.fuel.Accelerator;
import it.eneaminelli.fuel.ElectricBattery;
import it.eneaminelli.fuel.FuelSystem;
import it.eneaminelli.fuel.FuelTank;

public class CarTest {
    @Test
    public void testFuelTankConsumption(){
        FuelSystem fuelTank = new FuelTank(100);
        Accelerator accelerator = new Accelerator(fuelTank);

        accelerator.accelerate(10);
        assertEquals(90.0, accelerator.getFuelLevel(), 0.1);
    }

    @Test
    public void testElectricCarBattery(){
        FuelSystem battery = new FuelTank(50);
        Accelerator accelerator = new Accelerator(battery);

        accelerator.accelerate(5);
        assertEquals(45.0, accelerator.getFuelLevel(), 0.1);
    }

    @Test
    public void testCarFactoryElectric(){
        Accelerator accelerator = new Accelerator(new ElectricBattery(50));
        Car car = CarFactory.createCar(CarType.ELECTRIC, accelerator);

        assertEquals("ELECTRIC", car.getType());
        assertEquals(50.0, car.getFuelLevel(), 0.01);
    }
}
