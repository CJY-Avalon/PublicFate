package com.myEureka02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class myEurekaServer02 {
    public static  void main(String[] args){
        SpringApplication.run(myEurekaServer02.class,args);
    }
}
