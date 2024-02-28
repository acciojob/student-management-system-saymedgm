package com.driver;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, int id) {
        Student student = new Student(name, id);
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}

