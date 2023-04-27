package com.example.demo;

import io.vavr.collection.List;

public class StudentService {
    public List<Student> students=List.empty();
    public List<Student> getStudents()
    {
        return students;
    }

    public Student addStudent(NewStudent newStudent){
        Student created = new Student(students.size()+1, newStudent.name, newStudent.number, newStudent.section);
        students = students.prepend(created);
        return created;
    }
}
