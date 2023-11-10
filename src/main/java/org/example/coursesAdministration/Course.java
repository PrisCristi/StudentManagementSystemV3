package org.example.coursesAdministration;

import org.example.studantsAdministration.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.studantsAdministration.StudentManagement.getStudentId;
public class Course {
    private String courseName;
    private String courseId;
    private static List<String> enrolledStudents;
    private double grade;

    public Course(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Course(String courseName, String courseId) {

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<String> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public static void addGradingSystem(Course course, double grade) {



        }
}