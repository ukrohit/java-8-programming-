package com.java8.feature.functionalinterface;

import java.util.function.Consumer;

/**
 * ConsumerDemo
 * Demonstrates the use of Consumer functional interface in Java 8.
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> printUpper = s -> System.out.println(s.toUpperCase());
        printUpper.accept("hello world");
    }
}
