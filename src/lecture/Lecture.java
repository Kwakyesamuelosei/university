package lecture;

import student.Student;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private List<Student> students = new ArrayList<>();

    public void enter(Student student){
//        System.out.println("Printing student at a time: "+ student);
        this.students.add(student);
//        System.out.println("Printing All new student at a time: "+ this.students);
    }
    public Double getHighestAverageGrade(){
        Double tempGrade = 0.0;
//        System.out.println("Printing All Students Average Grades: " + this.students);
        for(Student student: students){
            if (tempGrade < student.getAverageGrade() ){
                tempGrade = student.getAverageGrade();
            }
        }
//        System.out.println("Highest Average Grade: " + tempGrade);
        return tempGrade;
    }

}
