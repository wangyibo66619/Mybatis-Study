package com.wang.dao;

import com.wang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 根据ID查询用户
    User getUserById(int id);

    // 分页查询
    List<User> getUserList(Map<String,Object> map);
}
