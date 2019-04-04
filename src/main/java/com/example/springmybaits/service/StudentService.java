package com.example.springmybaits.service;

import com.example.springmybaits.dao.StudentDao;
import com.example.springmybaits.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public void addStudent(Student student){
        studentDao.save(student);
    }

    public void updateStudent(Student student){
        studentDao.save(student);
    }

    public void deleteStudentById(int id){
        studentDao.deleteById(id);
    }

    public List<Student> finaAll(){
        return studentDao.findAll();
    }

}
