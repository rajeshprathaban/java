package com.enterprise.spring.jpa.postgresql.test;

public class HelloJava21 {

    public static void main(String [] args){
        System.out.println("Hello Java 21!");
    }

    public static String removeTrailingZeros(String input) {
        String response =
                input.contains(".") ? input.replaceAll("0*$", "").replaceAll("\\.$", "") : input;
        return response;
    }

}
