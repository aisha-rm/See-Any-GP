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
       return new Doctor(); 
       //doctorRepository.findById(doctorId);
    }

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Unimplemented method 'saveDoctor'");
    }

    @Override
    public void deleteDoctor(Long doctorId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDoctor'");
    }

    @Override
    public Doctor updateDoctor(Doctor doctor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDoctor'");
    }

    @Override
    public List<Doctor> getDoctors() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDoctors'");
    }
    
    static Doctor unwrapDoctor(Optional<Doctor> entity, Long id){
        if(entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(id, Doctor.class);
    }
}
