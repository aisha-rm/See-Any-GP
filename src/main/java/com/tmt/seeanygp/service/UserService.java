package com.tmt.seeanygp.service;

import java.util.List;

import com.tmt.seeanygp.model.User;

public interface UserService {
    
    User getUser(Long userId);
    User getUserByUsername(String username);
    User saveUser(User user);
    void deleteUser(Long userId);
    User updateUser(User user);
    List<User> getUsers();
}
