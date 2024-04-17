package com.oopbasics;

public class Ballistics {

    String deviceType;
    float deviceLength;
    String countryOfOrigin;

    public Ballistics(String deviceType, float deviceLength, String countryOfOrigin) {
        this.deviceType = deviceType;
        this.deviceLength = deviceLength;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String trigger() {
        return "Triggered Device "+this.deviceType;
    }

    public double getFiringRange() {
        return 0.0;
    }
}
