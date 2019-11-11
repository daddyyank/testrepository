package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserDao {
    User findUserById(int id);
    @MapKey("id")
    Map<Integer,User> findAll();
}
