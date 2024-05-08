package com.oopbasics.composition;

public class CarMethods extends Car{

    public CarMethods() {
    }

    public void startCar() {
        super.setStarted(true);
    }

    public void stopCar() {
        super.setStarted(false);
    }

    public void changeGear(int speed) {
        if(super.isStarted()) {
            if(speed > 10 && speed <20) {
                super.getTransmission().setActiveGear(1);
            }else if(speed >=20 && speed <=50) {
                super.getTransmission().setActiveGear(2);
            }
            System.out.println("Changing Gear To : "+super.getTransmission().getActiveGear());
        }else {
            System.out.println("Please start the car first!");
        }

    }
}
