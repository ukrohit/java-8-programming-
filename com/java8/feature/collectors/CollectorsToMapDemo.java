package com.java8.feature.collectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * CollectorsToMapDemo
 * Demonstrates collecting stream elements into a Map.
 */
public class CollectorsToMapDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack");
        Map<String, Integer> nameLengthMap = names.stream()
            .collect(Collectors.toMap(name -> name, name -> name.length()));
        System.out.println(nameLengthMap);
    }
}
