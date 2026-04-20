package com.example.demoWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {

    @Autowired
    private StudentService ss;

    @Autowired
    private StudentServiceDB ssdb;

    @GetMapping("/")
    public String welcome(){
        return "Welcome Student";
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student s){
       //return ss.addStudent(s);
        return ssdb.addStudent(s);
    }

    @GetMapping("/students")
    public ArrayList<Student> getStudents(){
        return ss.getStudents();
    }

    @GetMapping("student/{name}")
    public Student getStudent(@PathVariable String name){
        return ss.getStudent(name);
    }

    @GetMapping("student")
    public Student getStudent(@RequestParam double gpa){
        return ss.getStudent(gpa);
    }

    @PutMapping("student/{name}")
    public Student updateStudent(@PathVariable String name,
                                 @RequestBody Student s){
        return ss.updateStudent(name, s);
    }
}
