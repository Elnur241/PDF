package com.example.demo.Service.inter;

import com.example.demo.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService {
Student mySave(Student student);
Student myFind(int id);
List<Student> myGetAll();
Student myGetById(int id);
Student myUpdate(Student student,int id);
void deletebyId(int id);
}
