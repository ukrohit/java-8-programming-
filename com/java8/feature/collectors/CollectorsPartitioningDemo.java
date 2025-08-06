package com.java8.feature.collectors;

import java.util.*;
import java.util.stream.Collectors;

/**
 * CollectorsPartitioningDemo
 * Demonstrates partitioning elements by a predicate using Collectors.partitioningBy().
 */
public class CollectorsPartitioningDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> partitioned = nums.stream()
            .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitioned);
    }
}
