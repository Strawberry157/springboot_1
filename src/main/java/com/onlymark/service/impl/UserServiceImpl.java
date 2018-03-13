package com.onlymark.service.impl;

import com.onlymark.dao.UserMapper;
import com.onlymark.pojo.User;
import com.onlymark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        List<User> userList = userMapper.findAllList();

        return userList;
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);

    }

    @Override
    public User getById(Long id) {
        User user = userMapper.getById(id);
        return user;
    }

    @Override
    public void putUser(Long id, User user) {
        userMapper.putUser(id, user);
    }

    @Override
    public void remove(Long id) {
        userMapper.removeById(id);
    }
}
