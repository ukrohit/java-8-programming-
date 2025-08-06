package com.java8.newfeature;

import java.util.Arrays;
import java.util.List;

public class StreamBasicDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
