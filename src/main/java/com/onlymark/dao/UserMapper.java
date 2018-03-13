package com.onlymark.dao;

import com.onlymark.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper{

    @Insert("insert into user(name,age) values(#{name},#{age})")
    void addUser(User user);

    @Select("select id,name,age from user")
    List<User> findAllList();

    @Select("select id,name,age from user where id=#{id}")
    User getById(Long id);

    @Update("update user set name=#{user.name},age=#{user.age} where id=#{id}")
    void putUser(@Param("id") Long id, @Param("user") User user);

    @Delete("delete from user where id=#{id}")
    void removeById(Long id);
}
