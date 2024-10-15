package com.example.hello_doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.hello_doctor.entity.Doctor;
import com.example.hello_doctor.entity.user;
import com.example.hello_doctor.services.doctorservices;
import com.example.hello_doctor.services.userservices;

@Controller
public class navcontroller {
    @Autowired
    doctorservices dsr;
    @GetMapping("/regi")
    public String registerpage(){
        return "registration";
    }
    @GetMapping("/logoutd")
    public String repage(){
        return "index";
    }
    @GetMapping("/bk")
    public String getbk(Model model){
        List<Doctor>us=dsr.avilabilitystatus();
        System.out.println(us);
        model.addAttribute("ls", us);
        return "appointment";
    }
    @GetMapping("/gs")
    public String schemes(){
        return "govscheme";
    }
    
    @GetMapping("/sk")
    public String gethome(){
        return "patienthome";
    }
    @GetMapping("/fd")
    public String getfeedback(){
        return "feedbackform";
    }
    //admin navigation control
@GetMapping("/duk")
public String getadminHome(){
    return "adminhome";
}
@GetMapping("/comp")
public String getcomplaint(){
    return "complaint";
}

@GetMapping("/add")
public String adddoctor(){
    return "adddoctor";
}
@GetMapping("/redirect")
public String pagenav(){
    return "doctorschedule";
}
@GetMapping("/fdw")
public String forgetpwnav(){
    return  "forgetpassword";
}
}
