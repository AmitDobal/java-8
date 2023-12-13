package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
    public static List<Student> sortStudentByName(){
        System.out.println("Student sorted by Name: ".toUpperCase());
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentByName1(){
        return StudentDataBase.getAllStudents().stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGpa(){
        System.out.println("\nStudent sorted by GPA: ".toUpperCase());
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        sortStudentByName().forEach(System.out::println);
        sortStudentByGpa().forEach(System.out::println);

    }
}
