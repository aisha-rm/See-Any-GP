package com.tmt.seeanygp.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tmt.seeanygp.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByFirstnameAndLastname(String firstname, String lastname);
   
}
