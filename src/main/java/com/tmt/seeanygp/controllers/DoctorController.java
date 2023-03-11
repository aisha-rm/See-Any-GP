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

import com.tmt.seeanygp.model.Doctor;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Doctor> getDoctor(@PathVariable Long id) {
        return null;
    }
    
    @PostMapping("/save")
    public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor Doctor) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Doctor> deleteDoctor(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Doctor> updateDoctor(@PathVariable Long id, @RequestBody Doctor Doctor) {
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<Doctor> getAllDoctors() {
        return null;
    }
}
