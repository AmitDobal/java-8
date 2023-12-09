package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> gradeFilterPredicate = student -> student.getGradeLevel() > 2;
    static Predicate<Student> gpaFilterPredicate = student -> student.getGpa() >= 3.9;

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        System.out.println();
        filterStudentByGpa();
    }

    public static void filterStudentByGradeLevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if (gradeFilterPredicate.test(student)) {
                System.out.println(student);
            }
        });

    }
    public static void filterStudentByGpa() {
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if (gpaFilterPredicate.test(student)) {
                System.out.println(student);
            }
        });

    }
}
