package com.example.ecommerce.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTest {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println(list.stream().reduce(0,(a,b)->a+b));
    }
}
