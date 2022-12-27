package com.lewis.address.feignClients;


import com.lewis.address.models.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "user", path = "/api/user")
public interface UserFeignClients {

    @GetMapping(value = "/{id}")
    ResponseEntity<User> findById(@PathVariable Integer id);
}
