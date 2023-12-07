package org.oop;

import org.oop.abstractClasses.Locksub;
import org.oop.access_control.Car;
import org.oop.interfaceClasses.DroneImpl;
import org.oop.interfaceClasses.PlaneImpl;
import org.oop.interfaceClasses.Pursuit;
import org.oop.override_overload.WaterPlane;
import org.oop.polymorphism.Vehicle;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Detective duke = new Detective();
        System.out.println("I am "+ duke.name + ", " + duke.age + " years old, and I am " + duke.height + " meters tall.");
        duke.age = duke.age + 1;

        Case dukesCase = new Case("The sword is missing.");
        System.out.println(dukesCase.clues[0]);

        System.out.println("---------ACCESS MODIFIERS--------");
        Car.creatCar();

        System.out.println("---------ENCAPSULATION-----------");
        org.oop.encapsulation.Car.creatCar();

        System.out.println("---------INHERITANCE-----------");
        org.oop.inheritance.Car.creatCar();

        System.out.println("---------OVERRIDE and OVERLOAD-----------");
        WaterPlane.creatPlane();

        System.out.println("---------POLYMORPHISM--------------");
        Vehicle.createVehicles();

        System.out.println("---------ABSTRACT CLASSES-----------");
        Locksub.creatLock();

        System.out.println("---------INTERFACE CLASSES-----------");
        DroneImpl.creatDrone();
        PlaneImpl.creatPlane();
        Pursuit pursuit = new Pursuit();
        pursuit.add(new DroneImpl());
        pursuit.add(new PlaneImpl());
        pursuit.add(new DroneImpl());
        pursuit.chase();
    }
}
