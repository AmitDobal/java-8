package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p = (i) -> {
        return i % 2 == 0;
    };

    static Predicate<Integer> p1 = i -> i % 2 == 0;
    static Predicate<Integer> p2 = i -> i % 5 == 0;

    public static void main(String[] args) {
        System.out.println(p.test(4));
        System.out.println(p1.test(5));

        predicateAnd();
        predicateOr();
        predicateOrNegate();
    }

    public static void predicateAnd(){
        System.out.println("Predicate And result for 10: " + p1.and(p2).test(10) );
        System.out.println("Predicate And result for 8: " + p1.and(p2).test(8) );
    }
    public static void predicateOr(){
        System.out.println("Predicate OR result for 10: " + p1.or(p2).test(10) );
        System.out.println("Predicate OR result for 8: " + p1.or(p2).test(8) );
    }

    public static void predicateOrNegate(){
        System.out.println("Predicate OR Negate result for 10: " + p1.or(p2).negate().test(10) );
        System.out.println("Predicate OR Negate for 8: " + p1.or(p2).negate().test(8) );
    }
}
