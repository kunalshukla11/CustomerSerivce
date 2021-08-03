package com.narendra.CustomerService.repository;

import com.narendra.CustomerService.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer,String> {
}
