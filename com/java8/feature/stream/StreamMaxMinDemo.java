package com.java8.feature.stream;

import java.util.Arrays;
import java.util.Optional;

/**
 * StreamMaxMinDemo
 * Demonstrates finding the maximum and minimum values in a list using Java 8 Stream API.
 */
public class StreamMaxMinDemo {
    public static void main(String[] args) {
        // Find max and min in a list of integers
        Optional<Integer> max = Arrays.asList(1,2,3,4,5).stream().max(Integer::compareTo);
        Optional<Integer> min = Arrays.asList(1,2,3,4,5).stream().min(Integer::compareTo);
        System.out.println("Max: " + max.orElse(0));
        System.out.println("Min: " + min.orElse(0));
    }
}
