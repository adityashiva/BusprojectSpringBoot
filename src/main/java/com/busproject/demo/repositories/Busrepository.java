package com.busproject.demo.repositories;

import com.busproject.demo.models.Busdetails;
import org.springframework.data.repository.CrudRepository;

public interface Busrepository extends CrudRepository<Busdetails,Integer> {
}
