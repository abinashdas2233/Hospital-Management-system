package com.example.hello_doctor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.hello_doctor.entity.appointment;


public interface appointmentrepository extends JpaRepository<appointment,Integer> {
  @Query("SELECT u FROM appointment  u WHERE u.doctorName = :name")
  List<appointment> findByDoctorName(@Param("name") String name);

}
