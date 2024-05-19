package com.oopbasics.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        try {
            System.out.println("Enter first number :");
            a = scanner.nextInt();
            System.out.println("Enter second number :");
            b = scanner.nextInt();
            System.out.println("The quotient is " + (a / b));
//        }catch(InputMismatchException e) {
//            System.out.println("Only Integer Values are Accepted!");
//        }catch(ArithmeticException e){
//            System.out.println("Division by 0 is undefined!");
//        }
        }catch(Exception e){
            System.out.println("Exception case!");
        }finally {
            System.out.println("I'll always execute irrespective of outcome!");
        }
    }
}
