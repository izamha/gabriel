package com.izamha.mybooking.model;

public class Student {
    int stdId;
    String stdName;
    int studentImageId;

    public Student(int stdId, String stdName, int studentImageId) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.studentImageId = studentImageId;
    }

    public int getStdId() {
        return stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public int getStudentImageId() {
        return studentImageId;
    }
}
