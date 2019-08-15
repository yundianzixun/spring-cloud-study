package com.itunion.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient
public class MicroserviceProviderUserRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderUserRibbonApplication.class, args);
    }

}
