package org.oop.access_control;

public class Car {
    private String unlockCode;
    private boolean airCondition;
    private String fromBrand;
    private String license;

    public Car(String unlockCode, boolean airCondition, String fromBrand, String license){
        this.unlockCode = unlockCode;
        this.airCondition = airCondition;
        this.fromBrand = fromBrand;
        this.license = license;
    }

    private String doorUnlockCode(){
        return unlockCode;
    }

    // only subclasses can access this method
    protected boolean hasAirCondition(){
        return airCondition;
    }

    // the method brand cannot be accessed outside the package: access_control
    String brand(){
        return fromBrand;
    }

    public String licensePlate(){
        return license;
    }

    public boolean equals(Car car){
        // the object can access all the attributes and methods of another object of type Car since they belong to the same class.
        if (this.unlockCode.equals(car.unlockCode) && this.license.equals(car.license)) return true;

        car.doorUnlockCode();
        car.hasAirCondition();

        return false;
    }

    public static void creatCar(){
        Car car = new Car("43442", true, "Ford", "3443 GP");
//        car.brand(); cannot be accessed
//        car.doorUnlockCode(); cannot be accessed
        System.out.println("License plate: " + car.licensePlate());
    }
}
