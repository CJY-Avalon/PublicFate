package com.fate.Customer.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class customer {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplelate(){
        return new RestTemplate();
    }
}
