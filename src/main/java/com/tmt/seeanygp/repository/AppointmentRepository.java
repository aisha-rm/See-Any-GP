package com.tmt.seeanygp.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tmt.seeanygp.model.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
    
    List<Appointment> findByPatientId(Long patientId);
    List<Appointment> findByDoctorId(Long doctorId);
    List<Appointment> findByDate(LocalDate date);
    
}
