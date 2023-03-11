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

import com.tmt.seeanygp.model.Patient;

@RestController
@RequestMapping("/patient")
public class PatientController {
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable Long id) {
        return null;
    }
    
    @PostMapping("/save")
    public ResponseEntity<Patient> savePatient(@RequestBody Patient Patient) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Patient> deletePatient(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Long id, @RequestBody Patient Patient) {
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<Patient> getAllPatients() {
        return null;
    }
}
