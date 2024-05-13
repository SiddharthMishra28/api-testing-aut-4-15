package com.oopbasics.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> myStudents = new HashMap<>();
        myStudents.put(1, "sid");
        myStudents.put(2, "prachi");
        myStudents.put(3, "shivam");
        myStudents.put(null, "bhabani");
        System.out.println(myStudents);
    }
}
