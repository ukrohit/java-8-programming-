package com.java8.feature.collectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * CollectorsToSetDemo
 * Demonstrates collecting stream elements into a Set (removes duplicates).
 */
public class CollectorsToSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = Arrays.asList(1, 2, 2, 3, 4, 4, 5)
            .stream()
            .collect(Collectors.toSet());
        System.out.println(set);
    }
}
