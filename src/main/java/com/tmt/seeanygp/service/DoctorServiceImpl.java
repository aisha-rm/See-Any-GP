package com.tmt.seeanygp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmt.seeanygp.exception.EntityNotFoundException;
import com.tmt.seeanygp.model.Doctor;
import com.tmt.seeanygp.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public Doctor getDoctor(Long doctorId) {
       Optional<Doctor> doctor = doctorRepository.findById(doctorId);
       return unwrapDoctor(doctor, doctorId); 
    }

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    //delete doctor
    @Override
    public void deleteDoctor(Long doctorId) {
        doctorRepository.deleteById(doctorId);
    }

    //update doctor
    @Override
    public Doctor updateDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    //get all doctors
    @Override
    public List<Doctor> getDoctors() {
        return (List<Doctor>) doctorRepository.findAll();
    }
    
    static Doctor unwrapDoctor(Optional<Doctor> entity, Long id){
        if(entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(id, Doctor.class);
    }
}
