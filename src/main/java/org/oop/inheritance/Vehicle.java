package org.oop.inheritance;

public class Vehicle {
    int weight;
    String name;

    public Vehicle(){
        name = "A vehicle";
        weight = 1300;
    }

    void setWeight(int weight){
        this.weight = weight;
    }

    String vehicleDetails(){
        return "The current weight of the vehicle is " + weight + " kilograms";
    }
    void printInfo(){
        System.out.println("Information of this vehicle");
        System.out.println("Name: " + name);
        System.out.println(vehicleDetails());
        System.out.println("--------");
    }
}
