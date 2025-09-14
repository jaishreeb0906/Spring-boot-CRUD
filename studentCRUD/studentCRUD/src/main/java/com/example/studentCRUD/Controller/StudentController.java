package com.example.studentCRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @GetMapping("Students/{rNo}")
     public Student getStudentsByRnoStudent(@PathVariable ("rNo") int rollNo){
        return studentService.getStudentsByRnoStudent(rollNo);
     }

     @PostMapping("Students")
     public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Success";

     }
     @PutMapping("Students")
     public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);

    }
    @DeleteMapping("Students/{rNo}")
    public String deleteStudent(@PathVariable int rNo){
        return studentService.deleteStudent(rNo);
    }


    
}
