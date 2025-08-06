package com.java8.feature.functionalinterface;

import java.util.function.Function;

/**
 * FunctionDemo
 * Demonstrates the use of Function functional interface in Java 8.
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'Java': " + stringLength.apply("Java"));
    }
}
