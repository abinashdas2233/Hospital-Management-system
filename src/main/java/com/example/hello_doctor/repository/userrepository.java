package com.example.hello_doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hello_doctor.entity.user;





public interface userrepository extends JpaRepository<user,Integer>{
    public user findByEmail(String email);

}
