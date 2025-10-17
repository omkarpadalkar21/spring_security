package com.omkar.spring_security.controller;

import com.omkar.spring_security.model.Users;
import com.omkar.spring_security.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService service;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping(path = "/register")
    public Users register(@RequestBody Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return service.register(user);
    }
}
