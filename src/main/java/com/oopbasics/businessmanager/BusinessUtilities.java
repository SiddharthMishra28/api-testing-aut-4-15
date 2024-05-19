package com.oopbasics.businessmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusinessUtilities {

    Scanner sc = new Scanner(System.in);

    public Business createBusiness() {
        int custCount = 0;
        int addressCount = 0;
        Business business = new Business();
        List<Customer> customerList = new ArrayList<>();
        System.out.println("Please enter Business Name : ");
        business.setBusinessName(sc.nextLine());
        System.out.println("Please enter Business Sector : ");
        business.setBusinessSector(sc.nextLine());
        System.out.println("Please enter Legal Entity : ");
        business.setLegalEntity(sc.nextLine());
        System.out.println("How many customers does this business have");
        custCount = sc.nextInt();
        for(int i=0; i<custCount; i++) {
            Customer customer = new Customer();
            // enter setters
            customerList.add(customer);
        }
        business.setCustomers(customerList);
        return business;
    }
}
