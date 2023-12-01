package org.oop.inheritance;

public class HybridCar extends Car{
    int spareBatteryReach = 200;

    int giveTotalBatteryReach(){
        return getReach() + spareBatteryReach;
    }
}
