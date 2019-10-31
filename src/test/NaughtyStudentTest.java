package test;

import lecture.Lecture;
import org.junit.jupiter.api.Test;
import student.Level;
import student.NaughtyStudent;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void getAverageGrade() {
        NaughtyStudent naughtyStudent = new NaughtyStudent("Sam", Level.THIRD,Arrays.asList(2.0,3.0));
        Double actual =  naughtyStudent.getAverageGrade();
        Double expected = 2.6;
        assertEquals(expected,actual);
    }
}