package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {


    public static List<Student> filterStudentByGradeLevel(int grade){
        System.out.println("Filter student by grade level: Grade -> ".toUpperCase() + grade);
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() == grade)
                .collect(toList());

    }

    public static List<Student> filterStudentByGender(String gender){
        System.out.println("Filter student by Gender: Gender -> ".toUpperCase() + gender);
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equalsIgnoreCase(gender))
                .collect(toList());

    }

    public static void main(String[] args) {
        filterStudentByGradeLevel(2).forEach(System.out::println);
        filterStudentByGender("male").forEach(System.out::println);
    }
}
