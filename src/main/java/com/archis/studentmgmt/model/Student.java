package com.archis.studentmgmt.model;

public class Student extends Person {
    private String studentNumber;
    private double gpa;

    public Student(int id, String name, String email, String studentNumber) {
        super(id, name, email);
        this.studentNumber = studentNumber;
        this.gpa = 0.0;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}