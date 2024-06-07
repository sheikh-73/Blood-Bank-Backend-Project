package com.example.services;

import com.example.dto.LoginDto;
import com.example.dto.PersonalInformationDto;
import com.example.entities.*;
import com.example.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements MyService
{
    @Autowired
    private DataRepository repository;
    @Autowired
    private DataRepositoryForFrom formRepository;
    private PersonalInformation information;

    @Override
    public String registration(PersonalInformationDto info)
    {
        PersonalInformation data = new PersonalInformation(
                info.getId(),
                info.getName(),
                info.getBloodGrp(),
                info.getPhoneNumber(),
                info.getAddress()
        );
        repository.save(data);
        return "successful";
    }

    @Override
    public String login(LoginDto info) {
        PersonalInformation data = repository.findByPhoneNumber(info.getPhoneNumber());
        if(data != null)
        {
            information = data;
            return "successful";
        }
        else
            return "error";
    }

    @Override
    public List<PersonalInformation> listOfPerson(String bloodGrp) {
        return repository.findByBloodGrp(bloodGrp);
    }

    @Override
    public PersonalInformation personalInfo() {
        return information;
    }

    @Override
    public String changeInfo(PersonalInformation info) {
        PersonalInformation data = repository.findByPhoneNumber(information.getPhoneNumber());
        data.setName(info.getName());
        data.setBloodGrp(info.getBloodGrp());
        data.setPhoneNumber(info.getPhoneNumber());
        data.setAddress(info.getAddress());
        repository.save(data);
        information = data;
        return "successful";
    }

    @Override
    public String form(Form data) {
        formRepository.save(data);
        return "done";
    }

    @Override
    public List<Form> notification() {
        return formRepository.findAll();
    }
}
