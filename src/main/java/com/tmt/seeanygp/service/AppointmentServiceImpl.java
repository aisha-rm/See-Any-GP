package com.tmt.seeanygp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmt.seeanygp.exception.EntityNotFoundException;
import com.tmt.seeanygp.model.Appointment;
import com.tmt.seeanygp.repository.AppointmentRepository;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    @Override
    public Appointment getAppointment(Long appointmentId) {
        Optional<Appointment> appointment = appointmentRepository.findById(appointmentId);
        return unwrapAppointment(appointment, appointmentId);
    }

    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public void deleteAppointment(Long appointmentId) {
        appointmentRepository.deleteById(appointmentId);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return (List<Appointment>) appointmentRepository.findAll();
    }

    @Override
    public List<Appointment> getAppointmentByPatient(Long patientId) {
        return appointmentRepository.findByPatientId(patientId);
    }

    @Override
    public List<Appointment> getAppointmentByDoctor(Long doctorId) {
        return appointmentRepository.findByDoctorId(doctorId);
    }

    @Override
    public List<Appointment> getAppointmentByDate(LocalDate date) {
        return appointmentRepository.findByDate(date);
    }
    
    static Appointment unwrapAppointment(Optional<Appointment> entity, Long appointmentId) {
        if (entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(appointmentId, Appointment.class);
    }
}
