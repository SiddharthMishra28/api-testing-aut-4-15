package com.oopbasics.encapsulation;

public class Person {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String password;

    public void getPersonDetails() {
        System.out.println("Person Details are:");
        System.out.println(this.fullName);
        System.out.println(this.email);
        System.out.println(this.phoneNumber);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
