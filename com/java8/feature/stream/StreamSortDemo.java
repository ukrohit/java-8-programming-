package com.java8.feature.stream;

import java.util.Arrays;
import java.util.List;

/**
 * StreamSortDemo
 * Demonstrates sorting a list of strings using Java 8 Stream API.
 */
public class StreamSortDemo {
    public static void main(String[] args) {
        // Create a list of names and sort them alphabetically
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");
        names.stream()
            .sorted() // Sort the names
            .forEach(System.out::println); // Print each name
    }
}
