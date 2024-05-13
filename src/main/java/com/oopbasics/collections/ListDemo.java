package com.oopbasics.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
//        String[] myArray = new String[]{"dsbadsa", "asdsasd"};
        List<String> myList = new ArrayList<>();
        myList.add("data 1");
        myList.add("data 2");
        myList.add("data 3");
        myList.add("data 4");
        myList.add("data 5");
        myList.add("data 6");
        System.out.println(myList.get(3));
    }
}
