package com.example.customer_sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CustRepo extends CrudRepository<Customer,Long> {

    //Customer findByCustomerid(Long id);
    //ArrayList<Customer> findByLastname(String name);



}


