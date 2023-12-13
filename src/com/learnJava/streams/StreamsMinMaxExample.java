package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integers){
        return integers.stream()
//                .reduce(Integer.MIN_VALUE,(a, b) -> a > b ? a : b);
                .reduce(Integer.MIN_VALUE,Integer::max);
    }
    public static Optional<Integer> findMaxValueOptional(List<Integer> integers){
        return integers.stream()
//                .reduce(Integer.MIN_VALUE,(a, b) -> a > b ? a : b);
                .reduce(Integer::max);
    }
    public static int findMinValue(List<Integer> integers){
        return integers.stream()
//               .reduce(Integer.MAX_VALUE,(a, b) -> a < b ? a : b);
                .reduce(Integer.MAX_VALUE,Integer::min);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2,5,12,4,14,6,3,2);

        System.out.println("Max value: " + findMaxValue(integers));
        System.out.println("Min value: " + findMinValue(integers));

        System.out.println("Max value: " + findMaxValue(new ArrayList<>()));
        Optional<Integer> result = findMaxValueOptional(new ArrayList<>());
        result.ifPresent(integer -> System.out.println("Max value: " + integer));

    }
}
