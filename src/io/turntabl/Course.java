package io.turntabl;

import java.util.List;

public class Course {
    private String name;
    private Lecturer lecturer;
    private List<Student> students;
    private List<CourseYear> courseYear;

    public Course(String name, Lecturer lecturer, List<Student> students, List<CourseYear> courseYear) {
        this.name = name;
        this.lecturer = lecturer;
        this.students = students;
        this.courseYear = courseYear;
    }

    public String getName() {
        return name;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<CourseYear> getCourseYear() {
        return courseYear;
    }
}
