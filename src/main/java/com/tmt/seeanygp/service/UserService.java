package com.tmt.seeanygp.service;

import java.util.List;

import com.tmt.seeanygp.model.User;

public interface UserService {
    
    User getUser(Long UserId);
    User saveUser(User User);
    void deleteUser(Long UserId);
    User updateUser(User User);
    List<User> getUsers();
}
