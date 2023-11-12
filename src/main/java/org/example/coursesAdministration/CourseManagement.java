package org.example.coursesAdministration;

import java.util.ArrayList;
import java.util.List;

public class CourseManagement {
    private static List<Course> couseList = new ArrayList<>();
    public static void addCourse(String courseName, String courseId) {
        if (courseName.isEmpty() || courseId.isEmpty()) {
        }
        if (courseName.contains(courseName)) {
            System.out.println("Course already exists");
            couseList.add(new Course(courseName, courseId));
        } else {
            System.out.println("New course added.");
        }
    }
    public static void updateCourse(Course courseNameUpdated, Course courseId){
        for (Course course : couseList){
            if(course.getId().equals(courseId)){
                course.setName(String.valueOf(courseNameUpdated));
                System.out.println("Course updated.");
            }else {
                System.out.println("Course can not be updated.");
            }
        }
    }
    public static void deleteCourse(String couseId){
        int index = 0;
        while (index< couseList.size()){
            Course course = couseList.get(index);
            if (course.getId().equals(couseId)){
                couseList.remove(index);
                System.out.println("Course deleted.");
            }else {
                System.out.println("Course could not be deleted");
            }
        } index++;
    }
    public static void displayCourse(){
        System.out.println("Course List:");

        for (Course course : couseList){
            System.out.println(couseList);
        }
    }
}

