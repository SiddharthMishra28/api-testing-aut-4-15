package com.oopbasics.stringmanipulation;

public class StringMethods {
    public static void main(String[] args) {
        String data = "firstName,lastName,email,phone:sid,mishra,sid@test.com,324783242:prachi,barsagade,prachi@test.com,7329479324";
//        String[] rows = data.split(":");
//        for(String tempStr: rows) {
//            String[] columns = tempStr.split(",");
//            for(String cell : columns) {
//                System.out.println(cell);
//            }
//        }

//        for(char c : data.toCharArray()){
//            System.out.println(c);
//        }

        StringBuilder builder = new StringBuilder();
        builder.append("I");
        builder.append("am");
        builder.append("a dynamic");
        builder.append("string");
        System.out.println(builder);

        StringBuffer buffer = new StringBuffer();
    }
}
