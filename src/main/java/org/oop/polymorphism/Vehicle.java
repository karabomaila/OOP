package org.oop.polymorphism;

public class Vehicle {
    int remainingFuel = 0;

    void refuel(){
        remainingFuel += 7;
    }

    void printMovementDescription(){
        System.out.println("Vehicle movement");
    }

    public static void createVehicles(){
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new Plane();

        for (Vehicle vehicle: vehicles){
            vehicle.printMovementDescription();
        }

        System.out.println("--------------");
        GasStation gasStation = new GasStation();

        Car car = new Car();
        gasStation.refuelVehicle(car);
        System.out.println("After refueling, the car remaining fuel is " + car.remainingFuel);

        Truck truck = new Truck();
        gasStation.refuelVehicle(truck);
        System.out.println("After refueling, the truck remaining fuel is " + truck.remainingFuel);
    }
}
