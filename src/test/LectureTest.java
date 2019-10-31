package test;

import lecture.Lecture;
import org.junit.jupiter.api.Test;
import student.Level;
import student.NaughtyStudent;
import student.Student;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    Lecture enter() {
        List<Double> grades1 = Arrays.asList(2.0,3.0);
        Student student1 = new Student("Yaa", Level.FIRST,grades1);
        List<Double> grades2 = Arrays.asList(4.5,3.0);
        Student student2 = new Student("Christy",Level.SECOND,grades2);
        List<Double> grades3 = Arrays.asList(2.0,6.5);
        Student student3 = new Student("Derrick",Level.FIRST,grades3);

        List<Double> naughtygrades1 = Arrays.asList(9.0,3.0);
        NaughtyStudent naughtyStudent1 = new NaughtyStudent("Zack",Level.FOURTH,naughtygrades1);
        List<Double> naughtygrades2 = Arrays.asList(19.0,3.0);
        NaughtyStudent naughtyStudent2 = new NaughtyStudent("Theo",Level.THIRD,naughtygrades2);


        Lecture lecture = new Lecture();
        lecture.enter(student1);
        lecture.enter(student2);
        lecture.enter(student3);
        lecture.enter(naughtyStudent1);
        lecture.enter(naughtyStudent2);

        return lecture;

    }

    @Test
    void getHighestAverageGrade() {
        Lecture lecture = enter();
        Double actual =  lecture.getHighestAverageGrade();
        Double expected = 11.1;
        assertEquals(expected,actual);
    }

}