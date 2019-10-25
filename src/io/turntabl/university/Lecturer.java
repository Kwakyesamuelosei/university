package io.turntabl.university;

public class Lecturer {
    private String name;
    private LecturerSubject lecturerSubject;

    public Lecturer(String name, LecturerSubject lecturerSubject) {
        this.name = name;
        this.lecturerSubject = lecturerSubject;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name  +
                ", lecturerSubject=" + lecturerSubject +
                '}';
    }

    public String getName() {
        return name;
    }

    public LecturerSubject getLecturerSubject() {
        return lecturerSubject;
    }
}
