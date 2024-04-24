package com.oopbasics.abstraction;

public class WindowsNic implements DTMF{
    @Override
    public void getOSDetails(String os) {
        // WINDOWS SPECIFIC LOGIC
    }

    @Override
    public void registerNetworkIp() {

    }

    @Override
    public void transmit() {

    }

    @Override
    public void receive() {

    }

    public static void main(String[] args) {
        DTMF windowsCard = new WindowsNic();
    }
}
