package com.example.demo.Repo;

import com.example.demo.Entity.Student;
import com.example.demo.Entity.employ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepoInter extends JpaRepository<Student,Integer> {

}
