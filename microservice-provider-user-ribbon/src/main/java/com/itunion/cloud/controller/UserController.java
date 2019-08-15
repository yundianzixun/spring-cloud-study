package com.itunion.cloud.controller;

import com.itunion.cloud.dao.UserRepository;
import com.itunion.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Lin
 * @Date: 2019-07-19 17:14
 * @Description: 用户Controller
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        User user = this.userRepository.getOne(id);
        System.out.println(user.toString());
        return user;
    }
}
