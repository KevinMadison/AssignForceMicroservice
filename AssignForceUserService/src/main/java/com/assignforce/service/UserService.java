package com.assignforce.service;

import com.assignforce.models.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User add(User user);
    User getById(int id);
    User getByUsername(String email);
    User update(User user);
}
