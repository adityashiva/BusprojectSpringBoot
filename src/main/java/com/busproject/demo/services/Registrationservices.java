package com.busproject.demo.services;

import com.busproject.demo.models.Busdetails;
import com.busproject.demo.models.Registration;
import com.busproject.demo.repositories.Registrationrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class Registrationservices {

    @Autowired
    Registrationrepository registrationrepository;


   public List<Registration> getregisterdetails()
   {
       List<Registration> registrationList=new ArrayList<>();

       registrationrepository.findAll().forEach(new Consumer<Registration>() {
           @Override
           public void accept(Registration registration) {
               registrationList.add(registration);
           }
       });
       return registrationList;
   }



    public void setRegistrationdetails(Registration registration )
    {

        Registration registration1=new Registration();

        registration1.setFirstName(registration.getFirstName());
        registration1.setLastName(registration.getLastName());
        registration1.seteMail(registration.geteMail());
        registration1.setGender(registration.getGender());
        registration1.setUserName(registration.getUserName());
        registration1.setPassword(registration.getPassword());

        registrationrepository.save(registration1);



        /*Registration registration1=new Registration();
        registration1.setFirstName(registration.getfirstname );
        registration1.getLastName()*/
    }
}
