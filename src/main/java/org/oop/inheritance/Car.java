package org.oop.inheritance;

public class Car extends Automobile{
    boolean isDriving;
    int reach;

    public Car(){
        name = "Fastest car in teh world";
        isDriving = true;
        color = "blue";
        reach = 500;
    }

    int getReach(){return reach;}

    @Override
    String vehicleDetails(){
        String info = "The current weight of the vehicle is " + weight + " kilograms.\n";
        if (isDriving){
            info += "Currently is driving. But it will park soon...\n";
        }
        else{
            info += "The car is parking. But it will start driving soon..\n";
        }
        info += getTireCount();
        return info;
    }

    public static void creatCar(){
        System.out.println("The superclass of Vehicle is " + Vehicle.class.getSuperclass());
        System.out.println("The superclass of Automobile is " + Automobile.class.getSuperclass());
        System.out.println("The superclass of Car is " + Car.class.getSuperclass());

        System.out.println();
        Vehicle vehicle = new Vehicle();
        vehicle.printInfo();
        Automobile automobile = new Automobile();
        automobile.printInfo();
        Car car = new Car();
        car.printInfo();
    }
}
