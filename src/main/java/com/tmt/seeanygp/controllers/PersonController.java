package com.tmt.seeanygp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmt.seeanygp.model.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/detail/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Long id) {
        return null;
    }
    
    @PostMapping("/save")
    public ResponseEntity<Person> savePerson(@RequestBody Person Person) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Person> deletePerson(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id, @RequestBody Person Person) {
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<Person> getAllPersons() {
        return null;
    }
    
}
