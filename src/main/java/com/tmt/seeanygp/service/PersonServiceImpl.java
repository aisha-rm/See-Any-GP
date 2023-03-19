package com.tmt.seeanygp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmt.seeanygp.exception.EntityNotFoundException;
import com.tmt.seeanygp.model.Person;
import com.tmt.seeanygp.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Person getPerson(Long personId) {
        Optional<Person> person = personRepository.findById(personId);
        return unwrapPerson(person, personId);
    }

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(Long personId) {
        personRepository.deleteById(personId);
    }

    @Override
    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> getPersons() {
        return (List<Person>) personRepository.findAll();
    }
    
    static Person unwrapPerson(Optional<Person> entity, Long personId) {
        if (entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(personId, Person.class);
    }
}
