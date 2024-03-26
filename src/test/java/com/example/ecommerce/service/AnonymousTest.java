package com.example.ecommerce.service;

public class AnonymousTest {
    AnonymousTestClass anonymousTestClass = new AnonymousTestClass(){
        public void call(){
            a = 100;
        }

        @Override
        public void call2() {

        }
    };
}

abstract class AnonymousTestClass{
    int a;

    abstract public void call();

    abstract public void call2();
}