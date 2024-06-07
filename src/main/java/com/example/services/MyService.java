package com.example.services;

import com.example.dto.LoginDto;
import com.example.dto.PersonalInformationDto;
import com.example.entities.Form;
import com.example.entities.PersonalInformation;

import java.util.ArrayList;
import java.util.List;

public interface MyService
{
    String registration(PersonalInformationDto info);
    List<PersonalInformation> listOfPerson(String bloodGrp);
    String login(LoginDto info);
    PersonalInformation personalInfo();
    String changeInfo(PersonalInformation info);
    String form(Form data);
    List<Form> notification();
}
