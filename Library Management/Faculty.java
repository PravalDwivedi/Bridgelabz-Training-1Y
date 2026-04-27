package com.gla;
public class Faculty extends User{
    private int facultyId;
    public Faculty(String name, int facultyId){
        super(name);
        this.facultyId=facultyId;
    }
    public int getFacultyId(){return facultyId;}
}