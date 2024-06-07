package com.example.dto;

public class LoginDto
{
    private String bloodGrp;
    private String phoneNumber;

    public LoginDto(String bloodGrp, String phoneNumber)
    {
        this.bloodGrp = bloodGrp;
        this.phoneNumber = phoneNumber;
    }
    public LoginDto() {}

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

    @Override
    public String toString() {
        return super.toString();
    }
}
