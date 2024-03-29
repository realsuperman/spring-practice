package com.example.ecommerce.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class evenStreamTest {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.stream().filter(v->v%2==0).forEach(System.out::println);
    }
}
