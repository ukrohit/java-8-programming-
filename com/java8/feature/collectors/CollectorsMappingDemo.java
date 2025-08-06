package com.java8.feature.collectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * CollectorsMappingDemo
 * Demonstrates using Collectors.mapping to transform elements before collecting.
 */
public class CollectorsMappingDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        List<Integer> lengths = names.stream()
            .collect(Collectors.mapping(String::length, Collectors.toList()));
        System.out.println(lengths);
    }
}
