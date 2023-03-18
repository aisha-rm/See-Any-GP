package com.tmt.seeanygp.repository;

import org.springframework.data.repository.CrudRepository;

import com.tmt.seeanygp.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
    
}

