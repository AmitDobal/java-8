package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        Predicate<Student> studentGradePredicate = student -> student.getGradeLevel() >= 3;
        Predicate<Student> studentGpaPredicate = student -> student.getGpa() >= 3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .filter(studentGradePredicate)
                .filter(studentGpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

       /* Stream<Student> stream1 = StudentDataBase.getAllStudents().stream();
        Stream<Student> stream2 = stream1.filter(studentGpaPredicate);
        Map<String, List<String>> studentMap = stream2.collect(Collectors.toMap(Student::getName, Student::getActivities));
*/
        studentMap.forEach((name, activities) -> System.out.println(name + "\t" + activities));
//        System.out.println(studentMap);


    }
}
