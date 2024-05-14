package com.example.hello_doctor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello_doctor.entity.appointment;
import com.example.hello_doctor.repository.appointmentrepository;

@Service
public class appointmentservicesimplementation implements appointmentservices {
    @Autowired
    appointmentrepository arepo;

    @Override
    public String createappointment(appointment ap) {
        // TODO Auto-generated method stub
        arepo.save(ap);

        return "done";
    }

    @Override
    public List<appointment> getstatus() {
        // TODO Auto-generated method stub
        
        return arepo.findAll();
    }

    
    
    



}
