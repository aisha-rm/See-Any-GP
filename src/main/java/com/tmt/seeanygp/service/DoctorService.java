package com.tmt.seeanygp.service;

import java.util.List;

import com.tmt.seeanygp.model.Doctor;

public interface DoctorService {
    
    Doctor getDoctor(Long doctorId);
    Doctor saveDoctor(Doctor doctor);
    void deleteDoctor(Long doctorId);
    Doctor updateDoctor(Doctor doctor);
    List<Doctor> getDoctors();
}
