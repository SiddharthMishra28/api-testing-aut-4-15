package com.oopbasics;

public class Phone {
    String model;
    String os;
    int ram;
    float screenSize;

    public Phone(String model, String os, int ram, float screenSize) {
        this.model = model;
        this.os = os;
        this.ram = ram;
        this.screenSize = screenSize;
    }

    public String switchPhoneOn() {
        if(this.os.equalsIgnoreCase("ANDROID")) {
            return "WELCOME TO ANDROID";
        }else {
            return "WECOME TO IOS";
        }
    }
}
