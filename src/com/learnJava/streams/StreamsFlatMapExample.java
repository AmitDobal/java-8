package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(s -> s.stream())//List::stream
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
    }
}
