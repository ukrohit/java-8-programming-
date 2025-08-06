package com.java8.feature.stream;

import java.util.Arrays;

/**
 * StreamMapDemo
 * Demonstrates mapping each number to its square using Java 8 Stream API.
 */
public class StreamMapDemo {
    public static void main(String[] args) {
        // Create a list of integers and map each to its square
        Arrays.asList(1,2,3,4,5)
            .stream() // Convert list to stream
            .map(n -> n * n) // Map each number to its square
            .forEach(System.out::println); // Print each squared number
    }
}
