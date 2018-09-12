package com.busproject.demo.repositories;

import com.busproject.demo.models.Registration;
import org.springframework.data.repository.CrudRepository;

public interface Registrationrepository extends CrudRepository<Registration,String> {
}
