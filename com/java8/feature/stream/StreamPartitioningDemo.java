package com.java8.feature.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * StreamPartitioningDemo
 * Demonstrates partitioning a list into two groups using a predicate (even/odd) with Java 8 Stream API.
 */
public class StreamPartitioningDemo {
    public static void main(String[] args) {
        // Partition numbers into even and odd
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> partitioned = nums.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0)); // Partition by even/odd
        System.out.println(partitioned);
    }
}
