package com.example.demo.Service.inter;

import com.example.demo.Entity.aasAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AasAccountService {
 List<aasAccount>getAllAccount();

}
