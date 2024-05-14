package com.example.hello_doctor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello_doctor.entity.Doctor;
import com.example.hello_doctor.repository.doctorrepository;
@Service
public class doctorserviceimplementation implements doctorservices {
@Autowired
doctorrepository dr;
    @Override
    public String doctorsch(Doctor d) {
        // TODO Auto-generated method stub
        dr.save(d);
        return "ok";
    }
    @Override
    public List<Doctor> avilabilitystatus() {
        // TODO Auto-generated method stub
        List<Doctor>status=dr.findAll();
        return status;
    }
    

}
