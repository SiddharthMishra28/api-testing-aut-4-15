package com.oopbasics.abstraction;

public class JioSim extends SimCard{
    @Override
    public void getIpAddressBasedOnGeneration(String type) {
        if(type.equalsIgnoreCase("Micro")) {
            System.out.println("Registering JIO "+type+" Sim");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JioSim microSim = new JioSim();
        microSim.registerNetwork();
    }
}
