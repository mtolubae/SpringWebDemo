package com.example.demoWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceDB {

    @Autowired
    private StudentRepo studentRepo;

    public String addStudent(Student s) {
        studentRepo.save(s);
        return "success";
    }
}
