package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/punkty")
public class PunktyController {
    final private StudentService service=new StudentService();
    @RequestMapping(
            value = "/students",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getUsers(){
        return service.getStudents().asJava();
    }
    @RequestMapping(
            value = "/students",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Student addUser(@RequestBody NewStudent newStudent){
        return service.addStudent(newStudent);
    }
}
