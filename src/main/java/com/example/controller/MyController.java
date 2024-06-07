package com.example.controller;

import com.example.dto.LoginDto;
import com.example.dto.PersonalInformationDto;
import com.example.entities.Form;
import com.example.entities.PersonalInformation;
import com.example.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("www.blood-bank.com")
public class MyController
{
    @Autowired
    private MyService service;

    @GetMapping(path = "msg")
    private String getMsg()
    {
        return "connect";
    }

    @GetMapping(path = "/home")
    private ArrayList<String> home()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("A+");
        list.add("A-");
        list.add("B+");
        list.add("B-");
        list.add("AB+");
        list.add("AB-");
        list.add("O+");
        list.add("O-");
        return list;
    }
    @PostMapping(path = "/home/registration")
    private String registration(@RequestBody PersonalInformationDto info)
    {
        return this.service.registration(info);
    }
    @GetMapping(path = "/home/{bloodGrp}")
    private List<PersonalInformation> listOfPerson(@PathVariable String bloodGrp) { return this.service.listOfPerson(bloodGrp);}
    @GetMapping(path = "/home/login")
    private String login(@RequestBody LoginDto info)
    {
        return this.service.login(info);
    }
    @GetMapping(path = "/home/login/personalInfo")
    private PersonalInformation personalInfo() { return this.service.personalInfo();}
    @PutMapping(path = "/home/login/personalInfo/changeInfo")
    private String changeInfo(@RequestBody PersonalInformation info)
    {
        return this.service.changeInfo(info);
    }
    @PostMapping(path = "/home/form")
    private String form(@RequestBody Form data)
    {
        return this.service.form(data);
    }

    @GetMapping(path = "/home/login/notification")
    private List<Form> notification()
    {
        return this.service.notification();
    }

}
