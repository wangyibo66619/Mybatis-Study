package com.wang.dao;

import com.wang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 根据ID查询用户
    @Select("select * from user where id=#{uid}")
    User getUserById(@Param("uid") int id);
    @Select("select * from user")
    List<User> getUserList();

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int InsertUser(User user);
    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int UpdateUser(User user);

    @Delete("delete from user where id = #{uid}")
    int DeleteUser(@Param("uid") int id);
}
