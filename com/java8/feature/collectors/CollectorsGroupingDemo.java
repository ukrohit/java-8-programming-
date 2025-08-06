package com.java8.feature.collectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * CollectorsGroupingDemo
 * Demonstrates grouping elements by a property using Collectors.groupingBy().
 */
public class CollectorsGroupingDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Bob");
        Map<Integer, List<String>> grouped = names.stream()
            .collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);
    }
}
