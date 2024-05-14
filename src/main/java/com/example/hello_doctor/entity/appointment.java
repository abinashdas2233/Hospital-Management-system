package com.example.hello_doctor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String patientName;
    Long contactNumber;
    String doctorName;
    int age;
    String diseases;
    String appointmentTime;
    public appointment() {
    }
    public appointment(int id, String patientName, Long contactNumber, String doctorName, int age, String diseases,
            String appointmentTime) {
        this.id = id;
        this.patientName = patientName;
        this.contactNumber = contactNumber;
        this.doctorName = doctorName;
        this.age = age;
        this.diseases = diseases;
        this.appointmentTime = appointmentTime;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public Long getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDiseases() {
        return diseases;
    }
    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }
    public String getAppointmentTime() {
        return appointmentTime;
    }
    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
    @Override
    public String toString() {
        return "appointment [id=" + id + ", patientName=" + patientName + ", contactNumber=" + contactNumber
                + ", doctorName=" + doctorName + ", age=" + age + ", diseases=" + diseases + ", appointmentTime="
                + appointmentTime + "]";
    }
    

}
