package com.example.hello_doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hello_doctor.entity.Doctor;

public interface doctorrepository extends JpaRepository<Doctor,Integer> {


}
