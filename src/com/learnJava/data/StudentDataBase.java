package com.learnJava.data;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {

    public static List<Student> getAllStudents() {
        Student s1 = Student.builder()
                .name("Adam")
                .gradeLevel(2)
                .gpa(3.6)
                .gender("male")
                .activities(Arrays.asList("swimming", "basketball", "volleyball"))
                .build();
        Student s2 = Student.builder()
                .name("Jenny")
                .gradeLevel(2)
                .gpa(3.8)
                .gender("female")
                .activities(Arrays.asList("swimming", "gymnastics", "soccer"))
                .build();
        Student s3 = Student.builder()
                .name("Emily")
                .gradeLevel(3)
                .gpa(4.0)
                .gender("female")
                .activities(Arrays.asList("swimming", "gymnastics", "aerobics"))
                .build();
        Student s4 = Student.builder()
                .name("Dave")
                .gradeLevel(3)
                .gpa(3.9)
                .gender("male")
                .activities(Arrays.asList("swimming", "gymnastics", "soccer"))
                .build();
        Student s5 = Student.builder()
                .name("Sophia")
                .gradeLevel(4)
                .gpa(3.6)
                .gender("female")
                .activities(Arrays.asList("swimming", "dancing", "football"))
                .build();
        Student s6 = Student.builder()
                .name("James")
                .gradeLevel(4)
                .gpa(3.6)
                .gender("male")
                .activities(Arrays.asList("swimming", "basketball", "baseball", "football"))
                .build();

        return Arrays.asList(s1, s2, s3, s4, s5, s6);
    }
}
