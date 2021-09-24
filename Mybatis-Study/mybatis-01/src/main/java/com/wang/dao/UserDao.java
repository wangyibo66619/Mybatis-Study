package com.wang.dao;

import com.wang.pojo.User;

import java.util.List;

public interface UserMapper {
    // 查询全部用户
    List<User> getUserList();
    // 根据ID查询用户
    User getUserById(int id);
    // 添加用户
    int addUser(User user);
     // 修改用户
    int updateUser(User user);
    // 删除用户
    int deleteUser(int a);
}
