package org.oop.interfaceClasses;

public class DroneImpl implements Flyable{
    @Override
    public void fly() {
        System.out.println("The Drone is flying, beep beep");
    }

    public static void creatDrone(){
        DroneImpl drone = new DroneImpl();
        drone.fly();
    }
}
