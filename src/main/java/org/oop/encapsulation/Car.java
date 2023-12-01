package org.oop.encapsulation;

// encapsulating the class attributes and that allows us to ensure that the correct values are assigned to the attributes.
public class Car {
    private int remainingFuel = 0;
    private boolean isEngineRunning = false;

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        if (remainingFuel >= 0) this.remainingFuel = remainingFuel;
    }

    public boolean isEngineRunning() {
        return isEngineRunning;
    }

    public void setEngineRunning(boolean engineRunning) {
        isEngineRunning = engineRunning;
    }

    public static void creatCar(){
        Car car = new Car();
        car.setRemainingFuel(-1);
        System.out.println(car.getRemainingFuel());
        car.setRemainingFuel(40);
        System.out.println(car.getRemainingFuel());
    }
}
