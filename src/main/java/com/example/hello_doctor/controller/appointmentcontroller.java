package com.example.hello_doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.hello_doctor.entity.appointment;
import com.example.hello_doctor.services.appointmentservices;

@Controller
public class appointmentcontroller {
    @Autowired
    appointmentservices as;
@PostMapping("/apra")
    public  String appointraise(appointment ap){
        as.createappointment(ap);
        return "appointmentsuccess";

    }
    @GetMapping("/cps")
public String getpatientstatus(Model model){
    List<appointment>patientstatus=as.getstatus();
    System.out.print(patientstatus);
    model.addAttribute("ps", patientstatus);
    return "patientstatus";

}

    }


