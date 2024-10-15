package com.example.hello_doctor.services;

import java.util.List;

import com.example.hello_doctor.entity.user;

public interface userservices {
    public String userregistration(user u);
    public boolean emailcheck(String email);
    public boolean validation(String email,String password);
    public String checkrole(String email);
    public List<user>fetchdoctor();
    public void byid(int id,String email,String cpw);
    public void bypassword(String ipw,String email,String cpw);
}
