package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int noOfNoteBooks(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getNoteBooks)
//                .reduce(0, (b1, b2) -> b1 + b2)
                .reduce(0, Integer::sum);
    }
    public static void main(String[] args) {
        System.out.println("No of notebooks: " +  noOfNoteBooks());
    }
}
