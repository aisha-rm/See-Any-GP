package com.tmt.seeanygp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.tmt.seeanygp.model.Appointment;


public interface AppointmentService {

    Appointment getAppointment(Long doctorId, Long patientId);
    Appointment saveAppointment(Appointment appointment, Long doctorId, Long patientId);
    Appointment updateAppointment(Appointment appointment, Long doctorId, Long patientId);
    void deleteAppointment(Long doctorId, Long patientId);
    Set<Appointment> getAllAppointments(); 
    List<Appointment> getAppointmentByPatient(Long patientId);
    List<Appointment> getAppointmentByDoctor(Long doctorId);
    List<Appointment> getAppointmentByDate(LocalDate date);
}
