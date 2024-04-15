package com.oopbasics;

public class MethodsDemo {

    public double calculateSum(int num1, int num2) {
        return num1+num2;
    }

    public int calculateStringLength(String val) {
        return val.length();
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        MethodsDemo m1 = new MethodsDemo();
        System.out.println(m1.calculateStringLength("sdsadsad"));
        System.out.println(m1.calculateSum(a, b));
    }
}
