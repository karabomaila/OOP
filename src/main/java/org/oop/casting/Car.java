package org.oop.casting;

// casting objects along their inheritance hierarchy, downwards and upwards casting.

public class Car {
    private String brand;
    private int age;
    private double remainingFuel;

    public Car(String brand, int age, double remainingFuel) {
        this.brand = brand;
        this.age = age;
        this.remainingFuel = remainingFuel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(double remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    @Override
    public boolean equals(Object object){
        // the car object can access all the attributes and methods of another car object regardless of whether they are private or not.
        if (object instanceof Car){
            Car car = (Car) object;
            if (car.brand.equals(this.brand) && car.age == this.age && car.remainingFuel == this.remainingFuel) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", age=" + age +
                ", remainingFuel=" + remainingFuel +
                '}';
    }
}
