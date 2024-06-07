package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "form")
public class Form
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "patientName")
    private String patientName;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "bloodGrp")
    private String bloodGrp;
    @Column(name = "hospitalName")
    private String hospitalName;
    @Column(name = "message")
    private String message;

    public Form(long id, String patientName, String phoneNumber, String bloodGrp, String hospitalName, String message) {
        this.id = id;
        this.patientName = patientName;
        this.phoneNumber = phoneNumber;
        this.bloodGrp = bloodGrp;
        this.hospitalName = hospitalName;
        this.message = message;
    }

    public Form() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", bloodGrp='" + bloodGrp + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
