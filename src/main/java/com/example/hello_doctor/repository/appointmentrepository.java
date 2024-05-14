package com.example.hello_doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hello_doctor.entity.appointment;

public interface appointmentrepository extends JpaRepository<appointment,Integer> {

}
