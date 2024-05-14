package com.example.hello_doctor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class user {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    int age;
    String email;
    String password;
    long contactno;
    String gender;
    String role;
    public user() {
        super();
    }
    public user(int id, String name, int age, String email, String password, long contactno, String gender,
            String role) {
            super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.contactno = contactno;
        this.gender = gender;
        this.role = role;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public long getContactno() {
        return contactno;
    }
    public void setContactno(long contactno) {
        this.contactno = contactno;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "user [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", password=" + password
                + ", contactno=" + contactno + ", gender=" + gender + ", role=" + role + "]";
    }
}