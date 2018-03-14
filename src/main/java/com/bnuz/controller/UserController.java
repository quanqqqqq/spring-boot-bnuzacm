package com.bnuz.controller;

import com.bnuz.entity.UserEntity;
import com.bnuz.repository.UserRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @ApiOperation(value = "获取所有用户信息列表")
    @GetMapping(value = "/getAllUser")
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }
}