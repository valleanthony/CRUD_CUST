package com.example.customer_sql;

import org.springframework.data.repository.CrudRepository;

public interface CustRepo extends CrudRepository<Customer,Long> {
}
