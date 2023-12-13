package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsLimitSkipExample {

    public static List<Student> limitStudents() {
        return StudentDataBase.getAllStudents().stream()
                .limit(2)
                .collect(Collectors.toList());
    }

    public static List<Integer> limitIntegers(List<Integer> integers) {
        return integers.stream()
                .limit(2)
                .collect(Collectors.toList());

    }
public static int limitReduceIntegers(List<Integer> integers) {
        return integers.stream()
                .limit(3)
                .reduce(0, Integer::sum);
    }
public static int skipReduceIntegers(List<Integer> integers) {
        return integers.stream()
                .skip(3)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2, 5, 12, 4, 14, 6, 3, 2);

        System.out.println(limitStudents());
        System.out.println(limitIntegers(integers));
        System.out.println(limitReduceIntegers(integers));
        System.out.println(skipReduceIntegers(integers));
    }
}
