package university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Doreen",1046,StudentYear.FIRST),
                new Student("Angie",1045,StudentYear.SECOND),
                new Student("Chris",1048,StudentYear.THIRD),
                new Student("Unis",1042,StudentYear.FOURTH),
                new Student("Yaa",1089,StudentYear.FIRST),
                new Student("Kobby",1078,StudentYear.SECOND),
                new Student("Dennis",1056,StudentYear.THIRD),
                new Student("Eugene",1034,StudentYear.FOURTH),
                new Student("Kwakye",1012,StudentYear.FIRST),
                new Student("Padmore",1019,StudentYear.SECOND),
                new Student("Jen",1090,StudentYear.THIRD),
                new Student("Osei",1050,StudentYear.FOURTH)
        );
        List<Student> firstYearStudent = new ArrayList<>();
        for( Student student : students){
            if(student.getStudentYear() == StudentYear.FIRST){
                firstYearStudent.add(student);
            }
        }

        Lecturer lecturer = new Lecturer("Mr Soli",LecturerSubject.PROGRAMMING);
        List<CourseYear> courseYearFirst = Arrays.asList(CourseYear.FIRST);
        Course course1 = new Course("Intro to Programming",lecturer,firstYearStudent,courseYearFirst);
        printCourse1(course1);


        List<Student> thirdFourthYearStudent = new ArrayList<>();
        for( Student student : students){
            if(student.getStudentYear() == StudentYear.THIRD || student.getStudentYear() == StudentYear.FOURTH){
                thirdFourthYearStudent.add(student);
            }
        }

        Lecturer lecturer2 = new Lecturer("Dr Jamal",LecturerSubject.GARDENING);
        List<CourseYear> courseYearThirdForth = Arrays.asList(CourseYear.THIRD,CourseYear.FOURTH);

        Course course2 = new Course("Advanced Gardening Program",lecturer2,thirdFourthYearStudent,courseYearThirdForth);
        printCourseThirdFouth(course2);

        List<Student> fourthYearStudent = new ArrayList<>();
        for( Student student : students){
            if(student.getStudentYear() == StudentYear.FOURTH){
                if(student.getName().startsWith("A") ||
                   student.getName().startsWith("E") ||
                   student.getName().startsWith("I") ||
                   student.getName().startsWith("O") ||
                   student.getName().startsWith("U")){
                    fourthYearStudent.add(student);
                }

            }
        }

        Lecturer lecturer3 = new Lecturer("Dr Katriku",LecturerSubject.PHYSICS);
        List<CourseYear> courseYearForth = Arrays.asList(CourseYear.FOURTH);
        Course course3 = new Course("Physics",lecturer3,fourthYearStudent,courseYearForth);
        printCourseFouth(course3);

    }

    private static void printCourseFouth(Course course3) {
        String resp = "Fourth Year Student Course: {" +
                "Course name=" + course3.getName() +
                ", lecturer=" + course3.getLecturer().getName() +
                ", students=" + course3.getStudents() +
                ", courseYear=" + course3.getCourseYear() +
                '}';
        System.out.println(resp);
    }

    private static void printCourse1(Course course1) {

        String resp = "First Year Student Course: {" +
                "Course name=" + course1.getName() +
                ", lecturer=" + course1.getLecturer().getName() +
                ", students=" + course1.getStudents() +
                ", courseYear=" + course1.getCourseYear() +
                '}';
        System.out.println(resp);
    }


    private static void printCourseThirdFouth(Course course2) {

        String resp = "Third & Fourth Year Student Course: {" +
                "Course name=" + course2.getName() +
                ", lecturer=" + course2.getLecturer().getName() +
                ", students=" + course2.getStudents() +
                ", courseYear=" + course2.getCourseYear() +
                '}';
        System.out.println(resp);
    }

}
