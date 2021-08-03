package com.narendra.CustomerService.controller;

import com.narendra.CustomerService.model.Customer;
import com.narendra.CustomerService.repository.CustomerRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Log
public class Controller  {


private  CustomerRepository customerRepository;

@Autowired
Controller(CustomerRepository customerRepository){this.customerRepository=customerRepository;}

    @RequestMapping("/healthcheck")
    public String sayHello(){
        log.info("Doing healthcheck");
        return "hello there";
    }

   @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
   public List<Customer> getUsers(){
    log.info("Getting all list of customer");
    return  customerRepository.findAll();

   }

    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public ResponseEntity<Customer> getUsers(@PathVariable String id){
        log.info("Getting all list of customer");
        Optional<Customer> customer=  customerRepository.findById(id);
        return ResponseEntity.of(customer);

    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public Customer addUser(@RequestBody Customer customer){

        log.info("Getting all list of customer");
       Customer customer1= customerRepository.save(customer);
       return customer1;
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<Customer> add(@RequestBody Customer customer){

        log.info("Getting all list of customer");
        Customer customer1= customerRepository.save(customer);
        return ResponseEntity.ok(customer1);
    }



}
