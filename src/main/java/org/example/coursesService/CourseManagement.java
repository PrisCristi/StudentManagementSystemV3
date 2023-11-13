package org.example.coursesService;

import java.util.Map;

public class CourseManagement {
    private Map<String, Course> courses;

    public CourseManagement(Map<String, Course> courses) {
        this.courses = courses;
    }
    public void addCourse(Course course) {
        courses.put(course.getId(), course);
        System.out.println("New course added.");
    }
    public void deleteCourse(Course course){
        if (courses.remove(course.getId()) == null)
            throw new RuntimeException("Course can not be deleted.");
        System.out.println("Course deleted");
    }
    public void updateCourse(Course course){
        if (!courses.containsKey(course.getId()))
            throw new RuntimeException("Course not found.");
        courses.put(course.getId(),course);
        System.out.println("Course updated");
    }
    public void displayCourse(){
        System.out.println("Course List:");
        courses.values().forEach(course ->
                System.out.println("Course name: " + course.getName() + "Course id: " + course.getId())
        );
    }
}

