package com.rishav.dependencyinjection;

public class Student {
    private String studentName;
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name is: "+studentName);
        System.out.println("Student Roll is: "+id);
    }
}
