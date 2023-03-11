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

import com.tmt.seeanygp.model.Appointment;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @GetMapping("/detail/{id}")
    public ResponseEntity<Appointment> getAppointment(@PathVariable Long id) {
        return null;
    }
    
    @PostMapping("/save")
    public ResponseEntity<Appointment> saveAppointment(@RequestBody Appointment appointment) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Appointment> deleteAppointment(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Appointment> updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment) {
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<Appointment> getAllAppointments() {
        return null;
    }
}
