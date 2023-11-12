package org.example.studentsAdministration;

import org.example.coursesAdministration.Course;

import java.util.List;

public class Student {
    private String name;
    private String id;
    private List<Course> enrolledcourses;

    public Student(String name, String studentId) {
        this.name = name;
        this.id = studentId;
    }
    public Student(List<Course> enroledCourses) {
        this.enrolledcourses = enrolledcourses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Course> getEnroledCourses() {
        return enrolledcourses;
    }

    public void setEnroledCourses(List<Course> enroledCourses) {
        this.enrolledcourses = enrolledcourses;
    }
}
