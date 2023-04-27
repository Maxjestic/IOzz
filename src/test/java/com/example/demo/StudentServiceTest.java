package com.example.demo;

import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class StudentServiceTest {
    @Test
    public void getEmptyList(){
        final StudentService service = new StudentService();
        List<Student> students = service.getStudents();
        assertTrue(students.isEmpty());
    }

    @Test
    public void addStudent(){
        final StudentService service = new StudentService();
        final Student created = service.addStudent(new NewStudent("Student1", "1-1-1", "IP"));
        assertNotNull(created);
    }

    @Test
    public void addStudentIsReturned(){
        final StudentService service = new StudentService();
        final Student created = service.addStudent(new NewStudent("Student1", "1-2-3", "IP"));
        final List<Student> all = service.getStudents();
        assertEquals(created.name, all.get(0).name);
    }

    @Test
    public void addStudentHasNewId(){
        final StudentService service = new StudentService();
        final Student created1 = service.addStudent(new NewStudent("Student1", "1-2-3", "IP"));
        final Student created2 = service.addStudent(new NewStudent("Student2", "1-2-3", "IP"));
        final List<Student> all = service.getStudents();
        assertNotEquals(all.get(0).id, all.get(1).id);
        assertEquals(2, all.size());
    }
}