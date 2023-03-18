package com.tmt.seeanygp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmt.seeanygp.model.Appointment;
import com.tmt.seeanygp.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public Appointment getAppointment(Long doctorId, Long patientId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAppointment'");
    }

    @Override
    public Appointment saveAppointment(Appointment appointment, Long doctorId, Long patientId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAppointment'");
    }

    @Override
    public Appointment updateAppointment(Appointment appointment, Long doctorId, Long patientId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAppointment'");
    }

    @Override
    public void deleteAppointment(Long doctorId, Long patientId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAppointment'");
    }

    @Override
    public Set<Appointment> getAllAppointments() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAppointments'");
    }

    @Override
    public List<Appointment> getAppointmentByPatient(Long patientId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAppointmentByPatient'");
    }

    @Override
    public List<Appointment> getAppointmentByDoctor(Long doctorId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAppointmentByDoctor'");
    }

    @Override
    public List<Appointment> getAppointmentByDate(LocalDate date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAppointmentByDate'");
    }
    
}
