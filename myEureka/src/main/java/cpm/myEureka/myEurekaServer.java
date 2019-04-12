package cpm.myEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class myEurekaServer {
    public static  void main(String[] args){
        SpringApplication.run(myEurekaServer.class,args);
    }
}
