package com.company;
import java.util.Date;

public class Group {
    Student students[];
    Course course;
    Date startDate;
    int durationInMonths;

    public Group() {}

    public Group(Student[] students, Course course, Date startDate, int durationInMonths) {
        this.students = students;
        this.course = course;
        this.startDate = startDate;
        this.durationInMonths = durationInMonths;
    }

    public void setStudents(Student students[]) {
        this.students = students;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public String getStudents() {
        String studentsString = "Students: ";
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            studentsString = studentsString + student.getFirstName() + " " + student.getLastName() + ", ";
        }
        return studentsString;
    }

    public String getCourse() {
        return "Course name: " + course.getName();
    }

    public Date getStartDate() {
        return startDate;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }
}
