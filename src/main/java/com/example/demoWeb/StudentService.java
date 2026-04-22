package com.example.demoWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class StudentService {
    //ArrayList<Student> list;
    HashMap<String,Long> mapNameId;

    @Autowired
    private StudentServiceDB ssdb;

    public StudentService(){
//        list = new ArrayList<>();
//        list.add(new Student("Altinay",4.0));
//        list.add(new Student("Iskender",3.9));
        mapNameId = new HashMap<>();
    }
    public String addStudent(Student s){
        //list.add(s);
        return "success";
    }

    public ArrayList<Student> getStudents() {
        return null; //list;
    }

    public Student getStudent(String name){
//        for (Student s:list){
//            if(s.getName().equals(name)) return s;
//        }
        return null;
    }

    public Student getStudent(double gpa){
//        for (Student s:list){
//            if(s.getGpa() == gpa) return s;
//        }
        return null;
    }

    public Student updateStudent(String name, Student s) {
//        Student found = this.getStudent(name);
//        if(found != null){
//            found.setName(s.getName());
//            found.setGpa(s.getGpa());
//        }
//        return found;

        return null;
    }
}
