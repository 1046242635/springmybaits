package com.example.springmybaits.controller;

import com.example.springmybaits.CommonResult.ServerResponse;
import com.example.springmybaits.entity.Student;
import com.example.springmybaits.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping(value = "/addStudent")
    public ServerResponse<Student> addStudent(Student student){
        try {
            studentService.addStudent(student);
            return ServerResponse.createBySuccess();
        }catch (Exception e){
            return ServerResponse.createByErrorMessage("失败");
        }
    }

    @PutMapping(value = "/updateStudent")
    public ServerResponse<Student> updateStudentById(Student student) {
        try {
            studentService.updateStudent(student);
            return ServerResponse.createBySuccess();
        } catch (Exception e) {
            e.printStackTrace();
           return ServerResponse.createByErrorMessage("失败");
        }
    }


    //根据id删除一条数据
    @DeleteMapping(value = "/deleteStudent/{id}")
    public ServerResponse<Student> deleteStudentById(@PathVariable(name = "id", required = true) Integer id) {
        try {
            studentService.deleteStudentById(id);
            return ServerResponse.createBySuccess();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.createByErrorMessage("失败");
        }
    }

    @GetMapping(value = "/findAll")
    public ServerResponse<List<Student>> findAll() {
        try {
            List<Student> list = studentService.finaAll();
            //将查询结果封装到CommonResult中
            return ServerResponse.createBySuccess(list);
        } catch (Exception e) {
            return ServerResponse.createByErrorMessage("失败");
        }
    }



}

