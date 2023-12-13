package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integers){
        return integers.stream()
                .reduce(1, (a,b) -> a * b);
    }
    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers){
        return integers.stream()
                .reduce((a,b) -> a * b);
    }

    public static Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,4,6);
        System.out.println(performMultiplication(integers));
        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());
        System.out.println(performMultiplicationWithoutIdentity(new ArrayList<>()).isPresent());

        Optional<Student> highestGpaStudent = getHighestGpaStudent();
        highestGpaStudent.ifPresent(System.out::println);
    }
}
