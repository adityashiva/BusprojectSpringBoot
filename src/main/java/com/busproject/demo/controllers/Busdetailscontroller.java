package com.busproject.demo.controllers;

import com.busproject.demo.models.Busdetails;
import com.busproject.demo.services.Busdetailsservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Busdetailscontroller {

   @Autowired
      Busdetailsservices busdetailsservices;

   @RequestMapping(value = "/busdetails")
  public List<Busdetails> busdetails()
  {
     return busdetailsservices.getAllbusdetails();
  }

}
