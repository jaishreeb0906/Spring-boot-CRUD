package com.example.studentCRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentCRUD.Student;
import com.example.studentCRUD.Service.StudentService; 

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("Students")
    public List<Student> getStudents(){

        return studentService.getStudents();

    }
    


    
}
