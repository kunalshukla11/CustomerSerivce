package com.narendra.CustomerService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customer")
public class Customer {
    @Id
    public String id;
    public String address;
    public String job;
    public String name;

}
