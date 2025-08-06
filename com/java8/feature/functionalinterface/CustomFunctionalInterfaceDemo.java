package com.java8.feature.functionalinterface;

/**
 * CustomFunctionalInterfaceDemo
 * Demonstrates a custom functional interface in Java 8.
 */
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class CustomFunctionalInterfaceDemo {
    public static void main(String[] args) {
        Greeting greet = n -> System.out.println("Hello, " + n + "!");
        greet.sayHello("Java");
    }
}
