package com.itunion.cloud.web.controller;

import com.itunion.cloud.entity.User;
import com.itunion.cloud.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: Lin
 * @Date: 2019年11月21日16:46:25
 * @Description: 商品Controller
 */
@RequestMapping("/goods")
@RestController
public class GoodsController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/users/{id}")
    public User findUserById(@PathVariable Long id){
        return this.userFeignClient.findUserById(id);
    }

}
