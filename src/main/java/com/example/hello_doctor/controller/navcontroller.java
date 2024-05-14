package com.example.hello_doctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class navcontroller {
    @GetMapping("/regi")
    public String registerpage(){
        return "registration";
    }
    @GetMapping("/logoutd")
    public String repage(){
        return "index";
    }
    @GetMapping("/bk")
    public String getbk(){
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
}
