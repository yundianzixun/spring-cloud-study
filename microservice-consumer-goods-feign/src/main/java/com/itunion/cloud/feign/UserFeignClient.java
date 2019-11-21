package com.itunion.cloud.feign;

import com.itunion.cloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: 郑亮亮
 * @Date: 2019-11-20 16:36
 * @Description: 会员Feign Client
 */
@FeignClient(name = "microservice-provider-user-feign",url = "http://127.0.0.1:8094/")
public interface UserFeignClient {
    @GetMapping("/users/{id}")
    User findUserById(@PathVariable("id") Long id);
}
