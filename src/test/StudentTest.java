package test;

import student.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade() {
        List<Double> grades = Arrays.asList(2.0,3.0);
        Student student = new Student(grades);
        Double average =  student.getAverageGrade();
        Double expected = 2.5;
        assertEquals(expected,average);
    }
}