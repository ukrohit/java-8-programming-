package com.java8.feature.collectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * CollectorsToListDemo
 * Demonstrates collecting stream elements into a List.
 */
public class CollectorsToListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5)
            .stream()
            .collect(Collectors.toList());
        System.out.println(list);
    }
}
