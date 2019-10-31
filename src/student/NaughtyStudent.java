package student;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(String name, Level level, List<Double> grades) {
        super(name,level,grades);
    }

    @Override
    public Double getAverageGrade() {
        Double studentAverage = super.getAverageGrade();
        Double average = studentAverage + 0.1;
//        System.out.println("Naughty Higest Score: " + average);
        return average;
    }


}
