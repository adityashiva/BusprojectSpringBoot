package com.busproject.demo.controllers;

import com.busproject.demo.models.Registration;
import com.busproject.demo.services.Registrationservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import java.util.List;

@RestController
public class Registrationcontroller {


    @Autowired
    Registrationservices registrationservices;

    @PostMapping(value = "/registerdetails")
    public void postregistrationdetails(@RequestBody Registration registration)
    {
        System.out.println("springboot");
      registrationservices.setRegistrationdetails(registration);

    }
    @RequestMapping(value = "getregisterdetails")
    public List<Registration> getregisterdetails()
    {
        return registrationservices.getregisterdetails();
    }
}
