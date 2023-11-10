package org.example.studantsAdministration;

import java.util.List;

public class Student {
    private String name;
    private String studentId;
    private List<String> enroledCourses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    public Student(List<String> enroledCourses) {
        this.enroledCourses = enroledCourses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<String> getEnroledCourses() {
        return enroledCourses;
    }

    public void setEnroledCourses(List<String> enroledCourses) {
        this.enroledCourses = enroledCourses;
    }
}
