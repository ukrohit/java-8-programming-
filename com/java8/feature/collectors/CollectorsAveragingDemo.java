package com.java8.feature.collectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * CollectorsAveragingDemo
 * Demonstrates averaging values in a stream using Collectors.averagingInt().
 */
public class CollectorsAveragingDemo {
    public static void main(String[] args) {
        double avg = Arrays.asList(1, 2, 3, 4, 5)
            .stream()
            .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Average: " + avg);
    }
}
