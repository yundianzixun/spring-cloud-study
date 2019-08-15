package com.itunion.cloud.web.controller;

import com.itunion.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Lin
 * @Date: 2019-07-19 18:27
 * @Description: 商品Controller
 */
@RestController
public class GoodsController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/goods/{id}")
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject("http://microservice-provider-user/simple/"+id,User.class);
    }

}
