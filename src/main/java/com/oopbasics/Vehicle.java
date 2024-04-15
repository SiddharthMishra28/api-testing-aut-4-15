package com.oopbasics;

public class Vehicle {
    String make;
    String model;
    String type;
    int numWheels;

    public Vehicle() {
        System.out.println("I am constructor!");
    }
    public Vehicle(String mk, String md) {
        this.make = mk;
        this.model = md;
    }
    public void startVehicle() {
        System.out.println("Starting vehicle "+this.model);
    }
    public void stopVehicle() {
        System.out.println("Vehicle Stopped!");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
    }
}
