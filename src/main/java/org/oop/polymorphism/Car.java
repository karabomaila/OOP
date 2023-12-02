package org.oop.polymorphism;


public class Car extends Vehicle{
    String color;
    Car(){
        this("red");
    }
    Car(String color){
        this.color = color;
        remainingFuel = 10;
    }

    @Override
    void printMovementDescription(){
        System.out.println("I drive on the roads.");
    }
}
