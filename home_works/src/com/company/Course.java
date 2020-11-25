package com.company;
import java.util.Date;

public class Course {
    String name;
    Date dateOfCreation;
    int ID;
    String teacherFullName;

    public Course() {}

    public Course(String name, Date dateOfCreation, int ID, String teacherFullName) {
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        this.ID = ID;
        this.teacherFullName = teacherFullName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTeacherFullName(String teacherFullName) {
        this.teacherFullName = teacherFullName;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public int getID() {
        return ID;
    }

    public String getTeacherFullName() {
        return teacherFullName;
    }
}
