package com.enterprise.spring.jpa.postgresql.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {

    public static void main(String[] args) {
        //Use primitive streams for better performance
        int[] array = new int[]{1, 2, 3, 4, 5};
        int sum = Arrays.stream(array).sum();
        System.out.println("Sum -> "+sum);

        //Avoid nesting streams, instead use intermediate collections like below
        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        List<String> list2 = Arrays.asList("orange", "pineapple", "mango");
        List<String> result = Stream.concat(list1.stream(), list2.stream())
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println("Fruits greater than 5 characters -> "+result.size());

        //Use parallel streams with caution
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int summm = list.parallelStream().reduce(0, Integer::sum);
        System.out.println("Sum -> "+summm);

        //Use lazy evaluation for better performance
        List<Integer> listt = Arrays.asList(1, 2, 3, 14, 5);
        Optional<Integer> resultt = listt.stream()
                .filter(n -> n > 3)
                .findFirst();
        System.out.println("First value greater than 3 in the list -> "+resultt);


        //do not do any manipulation in stream API like count++ | Avoid side effects
        List<String> lisst = Arrays.asList("apple", "banana", "cherry");
        int count = 0;
        List<String> lisstt = lisst.stream()
                .filter(s -> s.startsWith("a")).collect(Collectors.toList());
                //.forEach(s -> count++);
        System.out.println("Count: " + lisstt.size());

        //Use streams with immutable objects
        List<String> lisvt = Arrays.asList("apple", "banana", "cherry");
        List<String> resuvlt = lisvt.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        for (String lisat : resuvlt){
            System.out.println(lisat);
        }

        //Use filter() before map() to avoid unnecessary processing
        List<Integer> liist = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> filteredList = liist.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .collect(Collectors.toList());
        for (Integer i : filteredList){
            System.out.println(i);
        }

        //Prefer method references over lambda expressions
        List<Integer> licst = Arrays.asList(1, 2, 3, 4, 5);
        int suum = licst.stream()
                .reduce(0, Integer::sum);
        System.out.println("Suum -> "+suum);

        //Use distinct() to remove duplicates
        List<Integer> libst = Arrays.asList(1, 2, 3, 3, 4, 5, 5);
        List<Integer> distinctList = libst.stream()
                .distinct()
                .collect(Collectors.toList());
        for (Integer i : distinctList){
            System.out.println(i);
        }

        //Use sorted() with caution
        List<Integer> lixst = Arrays.asList(3, 2, 1);
        List<Integer> sortedList = lixst.stream()
                .sorted()
                .collect(Collectors.toList());
        for (Integer i : sortedList){
            System.out.println(i);
        }

        System.out.println("***********************");
        Person person = new Person();
        person.setName("Rajesh");
        person.setName(null);
        Person person1 = new Person();
        person1.setName("John");

        List<Person> people = new ArrayList<Person>();
        people.add(person);
        people.add(person1);

        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        for (String name : names){
            System.out.println(name);
        }

        System.out.println("***********************");

        Optional<String> maybeName = Optional.ofNullable(person.getName());
        String name = maybeName.orElse("Unknown");

        System.out.println(name);

        System.out.println("***********************");

        String namess = "baeldung";
        String newName = namess.replace("dung", "----");

        System.out.println(newName);

        System.out.println("***********************");

    }
}
