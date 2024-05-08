package com.oopbasics.composition;

public class Transmission {
    private String make;
    private int numGears;
    private String type;
    private int activeGear;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getActiveGear() {
        return activeGear;
    }

    public void setActiveGear(int activeGear) {
        this.activeGear = activeGear;
    }
}
