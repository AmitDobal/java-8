package com.learnJava.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1, 6)
                .mapToObj( i -> new Integer(i))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {

    }
}
