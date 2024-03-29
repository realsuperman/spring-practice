package com.example.ecommerce.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareTest {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list.stream().reduce(0, (a, b) -> a + b * b));
    }
}
