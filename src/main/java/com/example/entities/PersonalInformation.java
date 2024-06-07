package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Personal_Info")
public class PersonalInformation
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "bloodGrp")
    private String bloodGrp;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "address")
    private String address;


    public PersonalInformation(long id, String name, String bloodGrp, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.bloodGrp = bloodGrp;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public PersonalInformation() {}

    public long getId() {
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

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {

        return "Name: "+name+"\nPhone-Number: "+phoneNumber+"\n\n";
    }
}
