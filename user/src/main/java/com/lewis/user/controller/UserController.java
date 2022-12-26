package com.lewis.user.controller;


import com.lewis.user.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {

    @GetMapping
    public ResponseEntity<User> get()
    {
        return ResponseEntity.ok(new User(1, "Lewis","123932"));
    }
}
