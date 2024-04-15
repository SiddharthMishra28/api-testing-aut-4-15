package com.oopbasics;

public class InheritanceDemo {
    public static void main(String[] args) {
        IPhone iPhone11 = new IPhone("Iphone 11", "IOS", 2, 4.5f);
        System.out.println(iPhone11.switchPhoneOn());
        System.out.println(iPhone11.launchIStore());
    }
}
