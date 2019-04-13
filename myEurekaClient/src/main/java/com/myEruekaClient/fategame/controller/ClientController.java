package com.myEruekaClient.fategame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private DiscoveryClient Client;
    @RequestMapping(value = "/test/discover",method = RequestMethod.GET)
    public Object discover(){
       // List<String> list = Client.getServices();
        List<ServiceInstance> serverlist = Client.getInstances("eurekaClient");
        for (ServiceInstance ele : serverlist) {
            System.out.print(ele.getServiceId()+"**"+ele.getHost()+"**"+ele.getPort());
        }
        return  this.Client;
    }
}
