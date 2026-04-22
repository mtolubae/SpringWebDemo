package com.example.demoWeb;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{
    //public Student findByName();
}
