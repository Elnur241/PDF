package com.example.demo.Service;

import com.example.demo.Entity.Student;


import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Repo.IStudentRepoInter;
import com.example.demo.Service.inter.IStudentService;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("StudentServiceImpl")
public class StudentServiceImpl implements IStudentService {
    @Autowired
    IStudentRepoInter studentRepo;
    private Mapper mapper;

//    public StudentServiceImpl(IStudentRepoInter studentRepo) {
//        this.studentRepo = studentRepo;
//    }

    @Override
    public Student mySave(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student myFind(int id) {
        return studentRepo.getById(id);


    }



    @Override
    public List<Student> myGetAll() {
        List<Student> list = studentRepo.findAll();

        return list;
    }

    @Override
    public Student myGetById(int id) {
        return studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));
    }

    @Override
    public Student myUpdate(Student student, int id) {
        Student stud = studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("student", "id", id));
        stud.setName(student.getName());
        stud.setSur_Name(student.getSur_Name());
        stud.setEmail(student.getEmail());
        studentRepo.save(stud);
        return stud;
    }

    @Override
    public void deletebyId(int id) {
        Student stud = studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("student", "id", id));
        studentRepo.delete(stud);

    }
}
