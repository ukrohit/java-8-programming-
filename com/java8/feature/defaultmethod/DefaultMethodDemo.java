package com.java8.feature.defaultmethod;

interface Vehicle {
    default void print() {
        System.out.println("I am a vehicle!");
    }
}

class Car implements Vehicle {
    // inherits default method
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        new Car().print();
    }
}
