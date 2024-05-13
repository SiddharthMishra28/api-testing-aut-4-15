package com.oopbasics.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
//        List<String> mySet = new ArrayList<>();
        mySet.add("data1");
        mySet.add("data1");
        mySet.add("data1");
        mySet.add("data1");
        mySet.add("data1");
        mySet.add("data1");
        mySet.add("data1");
        System.out.println(mySet);
    }
}
