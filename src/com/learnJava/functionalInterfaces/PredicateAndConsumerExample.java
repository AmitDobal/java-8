package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> gradeFilterPredicate = student -> student.getGradeLevel() >= 3;
    Predicate<Student> gpaFilterPredicate = student -> student.getGpa() >= 3.9;
    BiConsumer<String, List<String>> printNameActivityBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
    Consumer<Student> studentConsumer = student -> {
        if (gradeFilterPredicate.and(gpaFilterPredicate).test(student)) {
            printNameActivityBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> studentList){
        studentList.forEach(studentConsumer);
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}
