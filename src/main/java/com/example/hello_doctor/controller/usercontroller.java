package com.example.hello_doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.hello_doctor.entity.user;
import com.example.hello_doctor.services.userservices;

import jakarta.servlet.http.HttpSession;

@Controller
public class usercontroller {
    @Autowired
    userservices usr;
    @PostMapping("/regsub")
    public String userregistration(user u){
        String enteredemail=u.getEmail();
        boolean storedemail=usr.emailcheck(enteredemail);
        if(storedemail==false){
        usr.userregistration(u);
        return "index";
        }
        else{
            return "emailexist";
        }
    }
    @PostMapping("/logsub")
    public String userlogin(user u){
        String enteredemail=u.getEmail();
        
        String enteredpassword=u.getPassword();
        boolean status=usr.validation(enteredemail,enteredpassword);

       if(status==true){
        String role=usr.checkrole(enteredemail);
        if(role.equals("admin") || role.equals("Doctor")){
            return "adminhome";
        }
        else{
            
    
            return "patienthome";
        }


       }
       else{
        return "loginfailed";

       }
        
    }

}
