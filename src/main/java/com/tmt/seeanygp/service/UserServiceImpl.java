package com.tmt.seeanygp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmt.seeanygp.exception.EntityNotFoundException;
import com.tmt.seeanygp.model.User;
import com.tmt.seeanygp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUser(Long userId) {
        return userRepository.findById(userId).orElse(null);
        // Optional<User> user = userRepository.findById(userId);
        // return unwrapUser(user, userId);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }
    
    static User unwrapUser(Optional<User> entity, Long userId) {
        if (entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(userId, User.class);
    }
    
}
