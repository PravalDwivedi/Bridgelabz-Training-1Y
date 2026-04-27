package com.gla;
public class Student extends User{
    private int studentId;
    private int year;
    private Branch branch;
    public Student(String name,int studentId,int year,Branch branch) {
        super(name);
        this.studentId=studentId;
        this.year=year;
        this.branch=branch;
    }
    public int getStudentId() {return studentId;}
    public int getYear() {return year;}
    public Branch getBranch() {return branch;}
}