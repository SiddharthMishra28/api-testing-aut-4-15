package com.oopbasics.composition;

public class CarManagementSystem {
    public static void main(String[] args) {
        Engine fiatEngine = new Engine();
        fiatEngine.setMake("FIAT Co.");
        fiatEngine.setCapacityInCc(1150);
        fiatEngine.setNumCylinders(4);

        Chassis monoChassis = new Chassis();
        monoChassis.setChassisNumber("VRK13213213");
        monoChassis.setType("Monocoque");

        Transmission cvtTransmission = new Transmission();
        cvtTransmission.setMake("Honda");
        cvtTransmission.setType("CVT");
        cvtTransmission.setNumGears(5);

        CarMethods punto = new CarMethods();
        punto.setEngine(fiatEngine);
        punto.setChassis(monoChassis);
        punto.setTransmission(cvtTransmission);
        punto.setStarted(true);

        punto.changeGear(15);
    }
}
