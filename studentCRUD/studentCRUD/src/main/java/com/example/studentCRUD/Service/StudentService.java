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
    
    public String updateStudent(Student student){
        int index=0;
        boolean found=false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRNo()==student.getRNo()){
                index=i;
                found=true;
                break;

            }
        }
        if(found==false){
             return "No such element exists";
        }else{
            students.set(index, student);
            return "Updation is done";
        }
    }
        public String deleteStudent(int rNo){
        int index=0;
        boolean found=false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRNo()==rNo){
                index=i;
                found=true;
                break;

            }
        }
        if(found==true){
             students.remove(index);
             return "Deleted sucessfully";
        }else{
           
            return "No such student exists";
        }

        }
       
    
}
