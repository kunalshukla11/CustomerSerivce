package com.narendra.CustomerService.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "account")
public class Account {


    String id;
    String password;
    String userName;
    Role role;

}
