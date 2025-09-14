package com.example.studentCRUD.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentCRUD.Student;

@Service
public class StudentService {

 
        List<Student> students = new ArrayList<>(
            Arrays.asList(
                new Student(1,"Anna","AI"),
                new Student(2,"Briana","Science")
            )
        );
    
    public List<Student> getStudents(){
        return students;
    }

   
    public Student getStudentsByRnoStudent(int rollNo) {
        int index=0;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRNo()==rollNo){
                index=i;
            }
          
        }
          return students.get(index);
    }


    public void addStudent(Student student) {
        students.add(student);
    }
    
}
