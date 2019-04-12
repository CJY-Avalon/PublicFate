package com.fate.Customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {
    public static final String REST_URL_prefix = "http://eurekaClient";
    //"http://localhost:7001";
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping(value = "customer/testRest")
    public String test(){
      return  restTemplate.getForObject(REST_URL_prefix+"/test/discover",String.class);
    }
}
