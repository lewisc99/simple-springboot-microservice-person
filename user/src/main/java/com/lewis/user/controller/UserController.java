package com.lewis.user.controller;


import com.lewis.user.models.User;
import com.lewis.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RefreshScope
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> get()
    {
       List<User> users =  userService.getAll();

       if (users == null)
       {
           return ResponseEntity.badRequest().build();
       }

       return ResponseEntity.ok(users);
    }
   @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Integer id)
    {
        Optional<User> user = userService.getById(id);

        if (user.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(user.get());
    }
}
