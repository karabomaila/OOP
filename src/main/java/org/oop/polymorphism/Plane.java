package org.oop.polymorphism;

public class Plane extends Vehicle{
    @Override
    void printMovementDescription(){
        System.out.println("I fly in the sky.");
    }
}
