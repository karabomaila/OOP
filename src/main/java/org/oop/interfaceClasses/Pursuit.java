package org.oop.interfaceClasses;

import java.awt.*;

public class Pursuit {
    private Flyable[] chasers = new  Flyable[3];
    private int items = 0;

    public void add(Flyable flyable){
        if (items > 2) return;
        chasers[items++] = flyable;
    }

    public void chase() {
        System.out.println("\nHot pursuit!");
        for (Flyable flyable : chasers) flyable.fly();
    }
}
