package com.oopbasics.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompoundCollections {
    public static void main(String[] args) {
        // SCENARIO 1
//        List<Map<String, String>> customerData = new ArrayList<>();
//        Map<String, String> firstRow = new HashMap<>();
//        firstRow.put("id", "1");
//        firstRow.put("firstName", "sid");
//        firstRow.put("lastName", "mishra");
//        firstRow.put("email", "sid@test.com");
//        firstRow.put("phone", "8032483024");
//
//        Map<String, String> secondRow = new HashMap<>();
//        secondRow.put("id", "2");
//        secondRow.put("firstName", "prachi");
//        secondRow.put("lastName", "barsagade");
//        secondRow.put("email", "prachi@test.com");
//        secondRow.put("phone", "3414314314");
//
//        customerData.add(firstRow);
//        customerData.add(secondRow);
//        System.out.println(customerData.get(1).get("email"));

        // SCENARIO 2
        Map<Integer, Customer> customerMap = new HashMap<>();
        Customer firstCustomer = new Customer();
        firstCustomer.setId(1);
        firstCustomer.setFirstName("sid");
        firstCustomer.setLastName("mishra");
        firstCustomer.setEmail("sid@test.com");
        firstCustomer.setPhone("32974832327");

        customerMap.put(1, firstCustomer);
        System.out.println(customerMap);
    }
}
