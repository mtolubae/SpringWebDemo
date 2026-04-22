package com.example.demoWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceDB {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private GenericApplicationContext context;

    public String addStudent(Student s) {
        context.registerBean(s.getName(), Address.class,()->new Address());
        Address a = (Address) context.getBean(s.getName());
//        a.setCity("Kant");
//        a.setCountry("Kyrgyzstan");
        addressRepo.save(a);

        s.setAddr(a);
        Student saved =studentRepo.save(s);
        System.out.println(saved.getId());
        return "success";
    }

    public Student updateStudent(String name, Student s){
        return null;
    }
}
