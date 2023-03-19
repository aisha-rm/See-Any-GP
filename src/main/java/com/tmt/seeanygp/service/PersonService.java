package com.tmt.seeanygp.service;

import java.util.List;

import com.tmt.seeanygp.model.Person;



public interface PersonService {
    
    Person getPerson(Long personId);
    Person savePerson(Person person);
    void deletePerson(Long personId);
    Person updatePerson(Person person);
    List<Person> getPersons();
}