package org.example.studentsService;

import java.util.Map;

public class StudentManagement {
    private Map<String, Student> students;

    public StudentManagement(Map<String, Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
        System.out.println("Student added.");
    }

    public void deleteStudent(Student student) {
        if (students.remove(student.getId()) == null)
            throw new RuntimeException("Student not found");
        System.out.println("Student deleted.");
    }

    public void updateStudent(Student student) {
        if (!students.containsKey(student.getId()))
            throw new RuntimeException("Student not found");
        students.put(student.getId(), student);
        System.out.println("Student updated.");
    }

    public void displayStudent() {
        System.out.println("Student List:");
        students.values().forEach(student ->
                System.out.println("Username: " + student.getName() + ", Id: " + student.getId())
        );

    }
}
