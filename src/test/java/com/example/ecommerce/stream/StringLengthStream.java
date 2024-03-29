package com.example.ecommerce.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLengthStream {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "kiwi", "orange", "strawberry", "pineapple"));
        list.stream().filter(i->i.length()>=5).forEach(System.out::println);
    }
}