package student;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> grades) {
        super(grades);
    }

    @Override
    public Double getAverageGrade() {
        Double studentAverage = super.getAverageGrade();
        Double average = studentAverage + 0.1;
//        System.out.println("Naughty Higest Score: " + average);
        return average;
    }


}
