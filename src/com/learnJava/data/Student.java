package com.learnJava.data;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    List<String> activities = new ArrayList<>();
    private int noteBooks;

    public Student(String name) {
        this.name = name;
    }

    public void printListOfActivities() {
        System.out.println(activities);
    }
}
