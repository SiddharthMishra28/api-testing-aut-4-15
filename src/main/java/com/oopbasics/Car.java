package com.oopbasics;

public class Car extends Vehicle{
    public Car(String make, String model) {
        super(make, model);
    }

    public static void main(String[] args) {
        Car santro = new Car("hyundai", "santro");
        santro.startVehicle();
    }
}
