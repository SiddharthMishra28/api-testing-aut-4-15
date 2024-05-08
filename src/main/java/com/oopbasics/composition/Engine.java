package com.oopbasics.composition;

public class Engine {
    private String make;
    private int capacityInCc;
    private int numCylinders;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getCapacityInCc() {
        return capacityInCc;
    }

    public void setCapacityInCc(int capacityInCc) {
        this.capacityInCc = capacityInCc;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }
}
