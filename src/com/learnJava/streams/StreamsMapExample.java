package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList(){
//        Function<Student, String> f1 = student -> student.getName();
//        Function<Student, String> f1 = Student::getName;
        return StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toList());
    }
    public static Set<String> namesSet(){
        return StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase).collect(Collectors.toSet());
    }
    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
