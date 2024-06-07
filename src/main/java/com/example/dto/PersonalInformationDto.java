package com.example.dto;

import com.example.entities.PersonalInformation;

public class PersonalInformationDto
{
    private long id;
    private String name, bloodGrp, phoneNumber, address;
    public PersonalInformationDto(long id, String name, String bloodGrp, String phoneNumber, String address)
    {
        this.id = id;
        this.name = name;
        this.bloodGrp = bloodGrp;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public PersonalInformationDto() {}

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
        return "name: "+name+"\nPhone-Number: "+phoneNumber+"\n\n";
    }
}
