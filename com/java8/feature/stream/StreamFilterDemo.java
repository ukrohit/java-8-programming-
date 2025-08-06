package com.java8.feature.stream;

import java.util.Arrays;

/**
 * StreamFilterDemo
 * Demonstrates filtering even numbers from a list using Java 8 Stream API.
 */
public class StreamFilterDemo {
    public static void main(String[] args) {
        // Create a list of integers and filter even numbers
        Arrays.asList(1,2,3,4,5,6,7,8,9,10)
            .stream() // Convert list to stream
            .filter(n -> n % 2 == 0) // Keep only even numbers
            .forEach(System.out::println); // Print each even number
    }
}
