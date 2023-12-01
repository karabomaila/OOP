package org.oop.inheritance;

// a class can only inherit from one super class.
public class Automobile extends Vehicle {
    int tires = 4;
    String color;

    public Automobile(){
        name = "Automobile";
        setWeight(1000);
        color = "white";
    }

    String getTireCount(){
        return "It has further " + tires + " tires";
    }

    @Override
    String vehicleDetails(){
        String info = "The current weight of the vehicle is " + weight + " kilograms.\n";
        info += getTireCount();
        return info;
    }
}
