package com.java8.feature.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");
        String joined = names.stream().collect(Collectors.joining(", "));
        System.out.println(joined);
    }
}
