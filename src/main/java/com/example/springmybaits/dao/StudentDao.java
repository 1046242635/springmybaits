package com.example.springmybaits.dao;


import com.example.springmybaits.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDao extends JpaRepository<Student,Integer> {

    public List<Student> findByName(String name);

}
