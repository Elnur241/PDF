package com.example.demo.Controller;

import com.example.demo.Entity.Student;
import com.example.demo.Service.inter.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
@Autowired
@Qualifier("StudentServiceImpl")
private IStudentService studentService;

    @PostMapping()
    public ResponseEntity<Student> getStudent( @RequestBody Student student){
        return new  ResponseEntity<Student>(studentService.mySave(student), HttpStatus.CREATED);
    }
    @GetMapping()
    public List<Student> getStudent(){
        return studentService.myGetAll();
    }
    @GetMapping("{id}")
    public Student getStudentById(
            @PathVariable("id") int StudId){
        return studentService.myGetById(StudId);
    }

    @PutMapping("{id}")
    public ResponseEntity<Student> putStudentbyId(@PathVariable("id") int studId,@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.myUpdate(student,studId),HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") int studId){
        studentService.deletebyId(studId);
        return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
    }
}
