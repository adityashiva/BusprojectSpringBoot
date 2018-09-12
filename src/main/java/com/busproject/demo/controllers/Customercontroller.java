package com.busproject.demo.controllers;

import com.busproject.demo.models.Customerdata;
import com.busproject.demo.services.CustomerdataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customercontroller {
    @Autowired
    CustomerdataServices customerdataServices;

   @PostMapping(value = "/savecustomerdata")
    public Customerdata saveCustomerdata(@RequestBody Customerdata customerdata)
   {
       return customerdataServices.savecustomerdata(customerdata);
   }

}
