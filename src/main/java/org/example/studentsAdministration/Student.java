package org.example.studentsAdministration;

import org.example.coursesAdministration.Course;
import org.example.gradingSystem.Enrollment;

import java.util.List;

public class Student {
    private String name;
    private String id;
    private List<Enrollment> enrollments;

    public Student(String name, String studentId) {
        this.name = name;
        this.id = studentId;
    }
    public Student(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
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

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnroledCourses(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }
}
