package com.java8.feature.parallelstream;

import java.util.Arrays;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,5,6,7,8,9,10)
            .parallelStream()
            .forEach(System.out::println);
    }
}
