package com.oopbasics;

public class Rocket extends Ballistics{

    int rangeInKms;

    public Rocket(String deviceType, float deviceLength, String countryOfOrigin, int rangeInKms) {
        super(deviceType, deviceLength, countryOfOrigin);
        this.rangeInKms = rangeInKms;
    }

    public double getFiringRange() {
        if(super.deviceType.equalsIgnoreCase("ROCKET")){
            return this.rangeInKms * 0.7;
        }
        return this.rangeInKms;
    }

    public double getFiringRange(float efficiency) {
        if(super.deviceType.equalsIgnoreCase("ROCKET")){
            return this.rangeInKms * efficiency;
        }
        return this.rangeInKms;
    }

    public double getFiringRange(float efficiency, boolean isDetonatable) {
        if(super.deviceType.equalsIgnoreCase("ROCKET") && isDetonatable){
            return (this.rangeInKms * efficiency) + 10;
        }
        return this.rangeInKms;
    }
}
