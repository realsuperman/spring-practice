package com.example.ecommerce.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest {
    public static void main(String[] args){
        List<String> words = new ArrayList<>(Arrays.asList("Java", "Stream", "Practice", "Example"));
        List<String[]> list = words.stream().map(s -> s.split("")).toList();
        words.stream().flatMap(str -> Stream.of(str.split(""))).toList();
    }
}
