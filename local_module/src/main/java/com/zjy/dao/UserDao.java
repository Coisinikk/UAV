package com.zjy.dao;

import com.zjy.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //添加用户
    int add(Users user);


    //登录验证
    int login(@Param("userName") String userName, @Param("password") String password);

    //查询用户信息
    List findAll();
    //根据用户编号，删除用户信息
    int delete(Integer userId);
}
