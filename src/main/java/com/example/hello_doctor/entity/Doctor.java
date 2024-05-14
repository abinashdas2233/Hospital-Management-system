package com.example.hello_doctor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
@Id
@GeneratedValue(strategy = GenerationType.AUTO) 
int id;
String email;
String name;
String Specialist;
String time;
public Doctor() {
}
public Doctor(int id, String email, String name, String specialist, String time) {
    this.id = id;
    this.email = email;
    this.name = name;
    Specialist = specialist;
    this.time = time;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getSpecialist() {
    return Specialist;
}
public void setSpecialist(String specialist) {
    Specialist = specialist;
}
public String getTime() {
    return time;
}
public void setTime(String time) {
    this.time = time;
}
@Override
public String toString() {
    return "Doctor [id=" + id + ", email=" + email + ", name=" + name + ", Specialist=" + Specialist + ", time=" + time
            + "]";
}

}