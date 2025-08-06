package com.java8.feature.collectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * CollectorsJoiningDemo
 * Demonstrates joining strings from a stream into a single string.
 */
public class CollectorsJoiningDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");
        String joined = names.stream().collect(Collectors.joining(", "));
        System.out.println(joined);
    }
}
