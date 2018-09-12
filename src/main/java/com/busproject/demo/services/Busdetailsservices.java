package com.busproject.demo.services;

import com.busproject.demo.models.Busdetails;
import com.busproject.demo.repositories.Busrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class Busdetailsservices {

    @Autowired
    Busrepository busrepository;


   public List<Busdetails> getAllbusdetails()
   {
      List<Busdetails> busdetailsList=new ArrayList<>();
      busrepository.findAll().forEach(new Consumer<Busdetails>() {
          @Override
          public void accept(Busdetails busdetails) {
              busdetailsList.add(busdetails);
          }
      });

       return busdetailsList;
   }

}
