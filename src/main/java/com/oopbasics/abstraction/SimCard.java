package com.oopbasics.abstraction;

// PARTIAL ABSTRACTION
public abstract class SimCard {
    String generationType;
    String storageAvailable;
    String type;

    public void registerNetwork() throws InterruptedException {
        System.out.println("Searching for Network...");
        Thread.sleep(2000);
        System.out.println("Registetred!");
    }

    public abstract void getIpAddressBasedOnGeneration(String type);

}
