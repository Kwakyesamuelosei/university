package student;

import java.util.List;

public class Student {
    private List<Double> grades;

    public Student(List<Double> grades) {
        this.grades = grades;
    }

    public List<Double> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                '}';
    }
    public Double getAverageGrade(){

        Double average;
        Double totalGrade = 0.0;
        for (Double grade : grades){
            totalGrade+=grade;
        }
        average = totalGrade / grades.size();
        return average;
    }

}
