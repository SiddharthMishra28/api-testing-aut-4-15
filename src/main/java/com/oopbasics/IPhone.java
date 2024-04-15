package com.oopbasics;

public class IPhone extends Phone{
    public IPhone(String model, String os, int ram, float screenSize) {
        super(model, os, ram, screenSize);
    }
    public String launchIStore() {
        return "Opening IOS App Store";
    }
}
