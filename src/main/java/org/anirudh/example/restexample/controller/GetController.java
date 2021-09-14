package org.anirudh.example.restexample.controller;

import org.anirudh.example.restexample.model.Marks;
import org.anirudh.example.restexample.repository.MarksRepository;
import org.anirudh.example.restexample.model.Student;
import org.anirudh.example.restexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@Component
public class GetController {

    @Autowired
    StudentRepository student;

    @Autowired
    MarksRepository marks;

    @GetMapping("/")
    public String display(){
        return "Hello world";
    }

    @GetMapping("/student/all")
    public List<Student> getAllStudents(){
        return student.findAll();
    }

    @GetMapping(value = "/student", params = "id")
    public Optional<Student> getAnyStudent(@RequestParam("id") String id){
        return student.findById(id);
    }

    @GetMapping(value = "/student", params = "fname")
    public Optional<Student> getStudentByName(@RequestParam("fname") String fname){
        return student.findByFname(fname);
    }

    @GetMapping(value = "/student", params = {"fname", "lname"})
    public List<Student> getStudentByFullName(@RequestParam("fname") String fname, @RequestParam("lname") String lname){
        return student.findAllByFnameAndLname(fname, lname);
    }

    @GetMapping("/student/marks")
    public List<Marks> getAllMarks(){
        return marks.findAll();
    }

    @GetMapping(value = "/student/marks", params = "id")
    public Optional<Marks> getMarksById(@RequestParam("id") String sid){
        return marks.findById(sid);
    }
}
