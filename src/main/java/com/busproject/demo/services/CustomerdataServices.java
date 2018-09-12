package com.busproject.demo.services;

import com.busproject.demo.models.Customerdata;
import com.busproject.demo.repositories.Customerdatarepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerdataServices {
   @Autowired
    Customerdatarepository customerdatarepository;

   public Customerdata savecustomerdata(Customerdata customerdata)
   {
       Customerdata customerdata1=new Customerdata();
       customerdata1.setArrival(customerdata.getArrival());
       customerdata1.setDestination(customerdata.getDestination());
       customerdata1.setDuration(customerdata.getDuration());
       customerdata1.setRating(customerdata.getRating());
       customerdata1.setTime(customerdata.getUsername());
       return customerdatarepository.save(customerdata1);
   }

}
