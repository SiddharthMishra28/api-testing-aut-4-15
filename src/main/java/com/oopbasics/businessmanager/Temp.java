package com.oopbasics.businessmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        Address addr1 = new Address(1, "Eon Park", "Kharadi", "Pune", "Maharashtra", "India");
        Address addr2 = new Address(2, "Keshav Nagar", "Mundhwa", "Pune", "Maharashtra", "India");
        List<Address> addresses = new ArrayList<>();
        addresses.add(addr1);
        addresses.add(addr2);
        Customer cus1 = new Customer(1, "sid", "mishra", "sid@test.com", "8403280323", 2000000, addresses);
        List<Customer> custList = new ArrayList<>();
        custList.add(cus1);
        Business bus1 = new Business(1, "carSpa", "automobile", "car Spa pvt ltd", custList);
        List<Integer> incomes = new ArrayList<>();
        for(Customer c : bus1.getCustomers()) {
            incomes.add(c.getAnnualIncome());
        }
    }
}
