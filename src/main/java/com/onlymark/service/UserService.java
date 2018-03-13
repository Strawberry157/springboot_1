package com.onlymark.service;

import com.onlymark.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    void addUser(User user);

    User getById(Long id);

    void putUser(Long id, User user);

    void remove(Long id);
}
