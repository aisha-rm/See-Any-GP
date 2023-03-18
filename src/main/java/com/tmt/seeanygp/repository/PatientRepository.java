package com.tmt.seeanygp.repository;

import org.springframework.data.repository.CrudRepository;

import com.tmt.seeanygp.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {
    
}
