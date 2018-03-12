package com.bnuz.controller;

import com.bnuz.entity.UserEntity;
import com.bnuz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/getAllUser")
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }
}