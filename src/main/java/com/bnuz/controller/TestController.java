package com.bnuz.controller;

import com.bnuz.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }

    @RequestMapping("/testDate")
    @ResponseBody
    public Map<String, Object> testDate() {
        Map<String, Object> map = new HashMap<>();
        map.put("list", testRepository.findAll());
        return map;
    }
}