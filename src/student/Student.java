package student;

import java.util.List;

public class Student implements Nameable, HasLevel{
    private List<Double> grades;
    private String name;
    private Level level;

    public Student(String name, Level level, List<Double> grades) {
        this.grades = grades;
        this.name = name;
        this.level = level;
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


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Level getLevel() {
        return level;
    }
}
