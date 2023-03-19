package com.tmt.seeanygp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmt.seeanygp.exception.EntityNotFoundException;
import com.tmt.seeanygp.model.Patient;
import com.tmt.seeanygp.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient getPatient(Long patientId) {
        Optional<Patient> patient = patientRepository.findById(patientId);
        return unwrapPatient(patient, patientId);
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Long patientId) {
        patientRepository.deleteById(patientId);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return  patientRepository.save(patient);
    }

    @Override
    public List<Patient> getPatients() {
        return (List<Patient>) patientRepository.findAll();
    }
    
    static Patient unwrapPatient(Optional<Patient> entity, Long patientId) {
        if (entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(patientId, Patient.class);
    }
}
