package com.example.ecommerce.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctTest {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,2,3,5,6,4,7));
        list.stream().distinct().forEach(System.out::println);
    }
}
