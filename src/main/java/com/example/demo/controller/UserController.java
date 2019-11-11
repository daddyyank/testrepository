package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/select")
    public User testSelect(){
        return userService.selectUserById(2);
    }
    @RequestMapping("/selectall")
    public Map<Integer,User> testSelectAll(){
        return userService.selectAll();
    }
}
