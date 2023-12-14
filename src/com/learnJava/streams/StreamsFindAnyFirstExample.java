package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public  static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGpa() >= 3.9)
                .findAny();
    }

    public  static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGpa() >= 3.9)
                .findFirst();
    }
    public static void main(String[] args) {
        findAnyStudent().ifPresent(System.out::println);
        findFirstStudent().ifPresent(System.out::println);
        //No difference in the output. The difference comes while using the parallel streams
    }
}
