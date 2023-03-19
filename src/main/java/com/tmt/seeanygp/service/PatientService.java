package com.tmt.seeanygp.service;

import java.util.List;

import com.tmt.seeanygp.model.Patient;

public interface PatientService {
    
    Patient getPatient(Long patientId);
    Patient savePatient(Patient patient);
    void deletePatient(Long patientId);
    Patient updatePatient(Patient patient);
    List<Patient> getPatients();
}
