package com.java8.feature.collectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * CollectorsSummingDemo
 * Demonstrates summing values in a stream using Collectors.summingInt().
 */
public class CollectorsSummingDemo {
    public static void main(String[] args) {
        int sum = Arrays.asList(1, 2, 3, 4, 5)
            .stream()
            .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum: " + sum);
    }
}
