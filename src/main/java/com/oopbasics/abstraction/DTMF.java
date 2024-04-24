package com.oopbasics.abstraction;

/**
 * STANDARD IMPLEMENTATION OF TELECOM MESSAGING
 */
// 100% abstraction
public interface DTMF {

    /**
     *
     * @param os
     */
    public void getOSDetails(String os);

    /**
     *
     */
    public void registerNetworkIp();

    /**
     *
     */
    public void transmit();

    /**
     *
     */
    public void receive();
}
