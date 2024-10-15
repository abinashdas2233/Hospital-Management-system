package com.example.hello_doctor.services;

import java.util.List;

import com.example.hello_doctor.entity.appointment;

public interface appointmentservices {
    public String createappointment(appointment ap);
    public List<appointment>getstatus();
    public List<appointment>finddoctor(String name);

}
