package com.example.hello_doctor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.hello_doctor.entity.user;





public interface userrepository extends JpaRepository<user,Integer>{
    public user findByEmail(String email);
    @Query("SELECT u FROM user u WHERE u.role = :roleName")
    List<user> findByRoleName(@Param("roleName") String roleName);

}
