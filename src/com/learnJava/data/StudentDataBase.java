package com.learnJava.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {

    public static Supplier<Student> getStudent = () -> getAllStudents().get(0);

    public static List<Student> getAllStudents() {
        Student s1 = Student.builder()
                .name("Adam")
                .gradeLevel(2)
                .gpa(3.6)
                .gender("male")
                .activities(Arrays.asList("swimming", "basketball", "volleyball"))
                .noteBooks(11)
                .build();
        Student s2 = Student.builder()
                .name("Jenny")
                .gradeLevel(2)
                .gpa(3.8)
                .gender("female")
                .activities(Arrays.asList("swimming", "gymnastics", "soccer"))
                .noteBooks(12)
                .build();
        Student s3 = Student.builder()
                .name("Emily")
                .gradeLevel(3)
                .gpa(4.0)
                .gender("female")
                .activities(Arrays.asList("swimming", "gymnastics", "aerobics"))
                .noteBooks(10)
                .build();
        Student s4 = Student.builder()
                .name("Dave")
                .gradeLevel(3)
                .gpa(3.9)
                .gender("male")
                .activities(Arrays.asList("swimming", "gymnastics", "soccer"))
                .noteBooks(9)
                .build();
        Student s5 = Student.builder()
                .name("Sophia")
                .gradeLevel(4)
                .gpa(3.6)
                .gender("female")
                .activities(Arrays.asList("swimming", "dancing", "football"))
                .noteBooks(15)
                .build();
        Student s6 = Student.builder()
                .name("James")
                .gradeLevel(4)
                .gpa(3.9)
                .gender("male")
                .activities(Arrays.asList("swimming", "basketball", "baseball", "football"))
                .noteBooks(14)
                .build();

        return Arrays.asList(s1, s2, s3, s4, s5, s6);
    }
}
