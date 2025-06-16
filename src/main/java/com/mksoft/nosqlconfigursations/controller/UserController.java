package com.mksoft.nosqlconfigursations.controller;

import com.mksoft.nosqlconfigursations.documents.User;
import com.mksoft.nosqlconfigursations.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService ;
    UserController(){
        this.userService = new UserService();
    }
    @GetMapping("/save")
    public String saveUser(){
        User user = User.builder()
                .userId(UUID.randomUUID().toString())
                .userEmail("manjeet@gmail.com")
                .userName("Manjeet")
                .build();
        return  userService.saveUser(user);

    }
}
