package org.oop.override_overload;

public class WaterPlane extends OldWaterPlane{
    int currentAltitude = 7;

    @Override
    void splashDown(){
        System.out.println("Landed even more safely!");
    }

    @Override
    int getFlightDetails(){return currentAltitude;}

    @Override
    void move(){
        System.out.println("I am travelling in a new Water plane");
    }

    void makeNoise(){
        System.out.println("thump thump");
    }

    // when overloading a method, the return type and the name of the method must the same. But the number of parameters
    // and their types must be different.
    void makeNoise(String sound){
        System.out.println(sound);
    }

    public static void creatPlane(){
        WaterPlane plane = new WaterPlane();
        plane.move();
        plane.makeNoise();
        plane.makeNoise("hum hum");
    }
}
