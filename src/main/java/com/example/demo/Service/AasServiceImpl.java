package com.example.demo.Service;

import com.example.demo.Entity.aasAccount;
import com.example.demo.Repo.AasAccountRepo;
import com.example.demo.Service.inter.AasAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AasServiceImpl implements AasAccountService {
    @Autowired
    AasAccountRepo aasAccountRepo;
    @Override
    public List<aasAccount>  getAllAccount() {
        return aasAccountRepo.findAll();

    }
}
