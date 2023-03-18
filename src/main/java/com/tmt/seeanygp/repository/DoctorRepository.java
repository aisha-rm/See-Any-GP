package com.tmt.seeanygp.repository;

import org.springframework.data.repository.CrudRepository;

import com.tmt.seeanygp.model.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    
}

