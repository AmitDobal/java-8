package com.learnJava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /*prior java 8*/
        Comparator<Integer> comparator = new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                return o1.compareTo(o2);
            }
        };

        Integer a = 3;
        Integer b = 4;

        System.out.println("result of comparator is: " + comparator.compare(a, b));

        /*Using Lambda*/
        Comparator<Integer> comparator1 = (o1,o2) -> o1.compareTo(o2);
        System.out.println("result of comparator1 is: " + comparator1.compare(a, b));

    }
}
