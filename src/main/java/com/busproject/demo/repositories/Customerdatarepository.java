package com.busproject.demo.repositories;

import com.busproject.demo.models.Customerdata;
import org.springframework.data.repository.CrudRepository;

public interface Customerdatarepository extends CrudRepository<Customerdata,String> {
}
