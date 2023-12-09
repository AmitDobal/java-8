package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
    static Function<List<Student>, Map<String, Double>> studentFunction = studentList -> {
        Map<String, Double> studentMap = new HashMap<>();
        studentList.forEach(student -> {
            if (PredicateStudentExample.gradeFilterPredicate.test(student)) {
                studentMap.put(student.getName(), student.getGpa());
            }
        });
        return studentMap;
    };

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
