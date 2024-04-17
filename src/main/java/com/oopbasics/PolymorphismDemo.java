package com.oopbasics;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Ballistics pslv1 = new Rocket("rocket", 40, "India", 300);
        System.out.println(pslv1.getFiringRange());
    }
}
