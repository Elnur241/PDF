package com.example.demo.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;






@Table(name="Student")
@Entity
@Data
@NoArgsConstructor
public class Student {
    @Id
    @SequenceGenerator(name="squence_Id",allocationSize = 1)
    @GeneratedValue(generator = "squence_Id",strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String sur_Name;

    private String email;

//    public Student() {
//    }
//
//    public Student(int id, String name, String surName, String email) {
//        this.id = id;
//        this.name = name;
//        this.surName = surName;
//        this.email = email;
//    }
//
//    public Student(String name, String surName, String email) {
//        this.name = name;
//        this.surName = surName;
//        this.email = email;
//    }
}
