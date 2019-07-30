package com.itunion.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroserviceConsumerGoodsApplication {
	//实例化一个RestTemplate 名字叫restTemplate
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	};
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConsumerGoodsApplication.class, args);
	}

}
