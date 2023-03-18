package com.tmt.seeanygp.service;

import java.util.List;

import com.tmt.seeanygp.model.Patient;

public interface PatientService {
    
    Patient getPatient(Long PatientId);
    Patient savePatient(Patient Patient);
    void deletePatient(Long PatientId);
    Patient updatePatient(Patient Patient);
    List<Patient> getPatients();
}
