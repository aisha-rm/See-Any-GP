package com.tmt.seeanygp.service;

import java.util.List;

import com.tmt.seeanygp.model.Person;



public interface PersonService {
    
    Person getPerson(Long PersonId);
    Person savePerson(Person Person);
    void deletePerson(Long PersonId);
    Person updatePerson(Person Person);
    List<Person> getPersons();
}