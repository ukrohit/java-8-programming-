package com.java8.feature.collectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * CollectorsCountingDemo
 * Demonstrates counting elements in a stream using Collectors.counting().
 */
public class CollectorsCountingDemo {
    public static void main(String[] args) {
        long count = Arrays.asList(1, 2, 3, 4, 5)
            .stream()
            .collect(Collectors.counting());
        System.out.println("Count: " + count);
    }
}
