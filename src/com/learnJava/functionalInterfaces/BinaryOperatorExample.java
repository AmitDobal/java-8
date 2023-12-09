package com.learnJava.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        BinaryOperator<Integer> integerBinaryOperator = (a, b) -> a*b;
        System.out.println(integerBinaryOperator.apply(x,y));

//        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        Comparator<Integer> comparator = Integer::compareTo;

        BinaryOperator<Integer> maxByExample = BinaryOperator.maxBy(comparator);
        System.out.println(maxByExample.apply(x, y));
        BinaryOperator<Integer> minByExample = BinaryOperator.minBy(comparator);
        System.out.println(minByExample.apply(x, y));



    }
}
