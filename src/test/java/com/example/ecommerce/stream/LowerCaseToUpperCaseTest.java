package com.example.ecommerce.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCaseToUpperCaseTest {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("heLlo","World","javA","strEam","practicE"));

        List<String> collect = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
    }
}
