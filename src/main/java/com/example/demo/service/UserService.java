package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User selectUserById(int id){
        return userDao.findUserById(id);
    }

    public Map<Integer,User> selectAll(){
        return userDao.findAll();
    }
}
