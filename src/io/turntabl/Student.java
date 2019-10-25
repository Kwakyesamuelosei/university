package io.turntabl;

public class Student {
    private String name;
    private int ID;
    private StudentYear studentYear;

    public Student(String name, int ID, StudentYear studentYear) {
        this.name = name;
        this.ID = ID;
        this.studentYear = studentYear;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name=" + name +
                ", ID=" + ID +
                ", studentYear=" + studentYear +
                '}';
    }

    public int getID() {
        return ID;
    }

    public StudentYear getStudentYear() {
        return studentYear;
    }
}
