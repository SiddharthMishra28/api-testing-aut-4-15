package com.oopbasics.encapsulation;

public class School {

    String name;
    String location;
    Person[] persons;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setFullName("Saahil");
        s1.setEmail("saahil@test.com");
        s1.setPhoneNumber("234322121321");
        s1.setPassword("Passs@123");

        Teacher t1 = new Teacher();
        t1.setFullName("Shital");
        t1.setEmail("shital@test.com");
        t1.setPassword("dlkjdas@34343");
        t1.setPhoneNumber("43243243243");
        t1.subjects = new String[]{"Physics", "Maths", "English"};

        School globalSchool = new School();
        globalSchool.location = "Kharadi";
        globalSchool.name = "Global School";
        globalSchool.persons = new Person[]{s1, t1};

        globalSchool.persons[1].getPersonDetails();
    }
}
