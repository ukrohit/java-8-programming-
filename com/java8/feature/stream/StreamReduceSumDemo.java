package com.java8.feature.stream;

import java.util.Arrays;

/**
 * StreamReduceSumDemo
 * Demonstrates reducing a list of numbers to their sum using Java 8 Stream API.
 */
public class StreamReduceSumDemo {
    public static void main(String[] args) {
        // Sum all numbers in the list using reduce
        int sum = Arrays.asList(1,2,3,4,5)
            .stream() // Convert list to stream
            .reduce(0, Integer::sum); // Reduce to sum
        System.out.println("Sum: " + sum);
    }
}
