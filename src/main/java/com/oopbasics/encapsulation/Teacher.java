package com.oopbasics.encapsulation;

public class Teacher extends Person{
    String[] subjects;

    @Override
    public void getPersonDetails() {
        System.out.println("Person Details are:");
        System.out.println(super.getFullName());
        System.out.println(super.getEmail());
        System.out.println(super.getPhoneNumber());
        for(String str : this.subjects) {
            System.out.println("Subject : "+str);
        }
    }
}
