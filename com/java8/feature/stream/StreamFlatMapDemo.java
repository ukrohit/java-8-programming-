package com.java8.feature.stream;

import java.util.*;

/**
 * StreamFlatMapDemo
 * Demonstrates flattening nested lists into a single stream using flatMap in Java 8 Stream API.
 */
public class StreamFlatMapDemo {
    public static void main(String[] args) {
        // Flatten a list of lists into a single stream
        List<List<String>> list = Arrays.asList(
            Arrays.asList("a", "b"),
            Arrays.asList("c", "d"),
            Arrays.asList("e", "f")
        );
        list.stream()
            .flatMap(Collection::stream) // Flatten nested lists
            .forEach(System.out::println); // Print each element
    }
}
