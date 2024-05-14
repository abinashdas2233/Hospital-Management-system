package com.example.hello_doctor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.hello_doctor.entity.Doctor;
import com.example.hello_doctor.services.doctorservices;

@Controller
public class doctorcontroller {
    @Autowired
    doctorservices dsr;
    @PostMapping("/dsk")
    public String doctorschedule(Doctor d){
        String ms=dsr.doctorsch(d);
        return "doctorschedule";
    }
    @GetMapping("/ds")
    public String getds(Model model){
        List<Doctor>dslList=dsr.avilabilitystatus();
        model.addAttribute("dslList", dslList);
        System.out.println(dslList);
        return "doctorstatus";
    }

}
