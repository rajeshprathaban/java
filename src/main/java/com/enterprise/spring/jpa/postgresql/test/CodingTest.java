package com.enterprise.spring.jpa.postgresql.test;

public class CodingTest {

    public static void main(String[] args)
    {
        System.out.println("*** Swap two numbers without using a third variable ***");
        int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"+" x = "+x+", y = "+y);

        checkPrimeNumber(3);

        //== –> checks reference equality
        //equals() –> checks the value equality
        System.out.println("*** Difference between equals and == in String ***");
        String firstString = "coderolls";
        String secondString = new String("coderolls");
        String thirdString = "coderolls";
        String fourthString = "CodeRolls";
        System.out.print("firstString.equals(secondString) : ");
        System.out.println(firstString.equals(secondString));
        System.out.print("firstString==(secondString) : ");
        System.out.println(firstString==(secondString));
        System.out.print("firstString.compareTo(secondString) : ");
        System.out.println(firstString.compareTo(fourthString));

        // Reverse a String
        System.out.println(reverseStringUsingStringBuilder("Rajesh"));
        System.out.println(reverseString("Ragul"));

        //Find vowels in a String
        String str = new String("Hi WelcomE");
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
            }
        }

        String string = "GeeksForGeeks";
        string = string.toLowerCase();
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            // check if char[i] is vowel
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e'
                    || string.charAt(i) == 'i'
                    || string.charAt(i) == 'o'
                    || string.charAt(i) == 'u') {
                // count increments if there is vowel in
                // char[i]
                count++;
            }
        }
        System.out.println("Given string contains "+count+" vowels ");

    }

    private static void checkPrimeNumber(int num) {
        System.out.println("The given number is: " + num);
        // initial count of factors
        int count = 0;
        // to check prime number
        if(num == 2) {
            System.out.println(num + " is a prime number");
        } else {
            // checking number of factors
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    count++;
                }
            }
            // checking number of counts to print result
            if(count == 2) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }

    public static String reverseStringUsingStringBuilder(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
}
