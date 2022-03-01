package com.example.demo.Controller;

import com.example.demo.Entity.aasAccount;
import com.example.demo.Service.inter.AasAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aas")
public class AasController {
   @Autowired
    AasAccountService aasAccountService;

    @GetMapping
    public List<aasAccount>getAllAccount(){
        return aasAccountService.getAllAccount();
    }
}
