package com.java8.feature.stream;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * StreamCollectSetDemo
 * Demonstrates how to use Java 8 Stream API to collect elements into a Set.
 * Duplicates are automatically removed when collecting to a Set.
 */
public class StreamCollectSetDemo {
    public static void main(String[] args) {
        // Create a list with duplicate elements
        Set<Integer> set = Arrays.asList(1,2,2,3,4,4,5)
            .stream() // Convert list to stream
            .collect(Collectors.toSet()); // Collect elements into a Set (removes duplicates)
        // Print the resulting set
        System.out.println(set);
    }
}
