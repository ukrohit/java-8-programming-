package com.java8.feature.stream;

import java.util.Arrays;

/**
 * StreamCountDemo
 * Demonstrates counting elements matching a condition using Java 8 Stream API.
 */
public class StreamCountDemo {
    public static void main(String[] args) {
        // Count how many numbers are greater than 5
        long count = Arrays.asList(1,2,3,4,5,6,7,8,9,10)
            .stream() // Convert list to stream
            .filter(n -> n > 5) // Keep numbers greater than 5
            .count(); // Count them
        System.out.println("Count > 5: " + count);
    }
}
