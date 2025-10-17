package com.omkar.spring_security.service;

import com.omkar.spring_security.model.Users;
import com.omkar.spring_security.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    public Users register(Users user) {
        return repo.save(user);
    }
}
