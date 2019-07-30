package com.itunion.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: Lin
 * @Date: 2019-07-29 23:01
 * @Description: 使用Eureka做服务发现
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryEurekaApplication {
    public static void main(String[] args){
        SpringApplication.run(MicroserviceDiscoveryEurekaApplication.class,args);
    }

}
