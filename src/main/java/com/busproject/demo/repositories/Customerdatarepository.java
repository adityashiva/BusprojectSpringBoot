package com.busproject.demo.repositories;

import com.busproject.demo.models.Customerdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Repository
public interface Customerdatarepository extends CrudRepository<Customerdata,String>  {




}
