package org.oop.interfaceClasses;

public class PlaneImpl implements Flyable{
    @Override
    public void fly() {
        System.out.println("The plane is taking off, Wrrooom");
    }

    public static void creatPlane(){
        Flyable plane = new PlaneImpl();
        plane.fly();
    }
}
