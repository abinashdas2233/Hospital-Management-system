package com.example.hello_doctor.services;

import java.security.MessageDigest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello_doctor.entity.user;
import com.example.hello_doctor.repository.userrepository;

@Service
public class userserviceimplementation implements userservices {
@Autowired
userrepository urepo;
    @Override
    public String userregistration(user u) {
        // TODO Auto-generated method stub
        urepo.save(u);
        return "regidone";
    }
    @Override
    public boolean emailcheck(String email) {
        // TODO Auto-generated method stub
      
        if(urepo.findByEmail(email)==null){
            return false;
        }
        else {
            return true;
        }
    }
    public boolean validation(String email, String password) {
        
        user user = urepo.findByEmail(email);
        
        
        if (user == null) {
            return false; 
        }
        
        
        String dbPassword = user.getPassword();
        
        // Constant-time comparison of passwords
        boolean passwordMatches = MessageDigest.isEqual(password.getBytes(), dbPassword.getBytes());
        
        return passwordMatches;
    }
    @Override
    public String checkrole(String email) {
        // TODO Auto-generated method stub
        user ds=urepo.findByEmail(email);
        String result=ds.getRole();
        return result;
    }
    @Override
    public List<user> fetchdoctor() {
        // TODO Auto-generated method stub

        return urepo.findByRoleName("Doctor");
    }
    
    
    

}
