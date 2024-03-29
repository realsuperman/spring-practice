package com.example.ecommerce.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortTest {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("banana","apple","orange","grape","kiwi"));
        list.stream().sorted((String::compareTo)).forEach(System.out::println);
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
