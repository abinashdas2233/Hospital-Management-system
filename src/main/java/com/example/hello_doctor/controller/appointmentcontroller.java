package com.example.hello_doctor.controller;







import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.hello_doctor.entity.Doctor;
import com.example.hello_doctor.entity.appointment;
import com.example.hello_doctor.services.appointmentservices;
import com.example.hello_doctor.services.doctorservices;

@Controller
public class appointmentcontroller {
    @Autowired
    appointmentservices as;
    @Autowired
    doctorservices dsr;
@PostMapping("/apra")
    public  String appointraise(appointment ap){
        as.createappointment(ap);
        return "appointmentsuccess";

    }
    @GetMapping("/cps")
public String getpatientstatus(Model model){
    List<Doctor>patientstatus=dsr.avilabilitystatus();
    
    
  System.out.println(patientstatus);
   
    model.addAttribute("ps", patientstatus);
    return "patientstatus";

}
@PostMapping("/preq")
public String finddoctor(Model model,@ModelAttribute appointment ap){
    String name=ap.getDoctorName();
    List<appointment>al=as.finddoctor(name);
    System.out.println(al);
    model.addAttribute("uk", al);
    return "displaypatient";
}
    }


