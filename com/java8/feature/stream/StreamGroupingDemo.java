package com.java8.feature.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * StreamGroupingDemo
 * Demonstrates grouping elements by a property (string length) using Java 8 Stream API.
 */
public class StreamGroupingDemo {
    public static void main(String[] args) {
        // Group names by their length
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Bob");
        Map<Integer, List<String>> grouped = names.stream()
            .collect(Collectors.groupingBy(String::length)); // Group by string length
        System.out.println(grouped);
    }
}
