package com.example.ecommerce.service;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest {
    public static void main(String[] args) {
        /*Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());

        Consumer<String> consumer =  (str) -> System.out.println(str.split(" ")[0]);
        consumer.andThen(System.out::println).accept("Hello World");*/

        /*Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Hello World"));*/

        /*Predicate<String> predicate = (str) -> str.equals("Hello World");
        System.out.println(predicate.test("Hello World"));*/

        Function<String, Integer> function = String::length;
        System.out.println(function.apply("Hello World"));

        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello World!");

        Predicate<Boolean> predicate = Objects::isNull;
        Predicate<Boolean> predicate2 = a->Objects.isNull(a);

    }
}