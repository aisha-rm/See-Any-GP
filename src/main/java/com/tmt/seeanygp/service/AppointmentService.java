package com.tmt.seeanygp.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.tmt.seeanygp.model.Appointment;


public interface AppointmentService {

    Appointment getAppointment(Long appointmentId);
    Appointment saveAppointment(Appointment appointment);
    Appointment updateAppointment(Appointment appointment);
    void deleteAppointment(Long appointmentId);
    Set<Appointment> getAllAppointments(); 
    List<Appointment> getAppointmentByPatient(Long patientId);
    List<Appointment> getAppointmentByDoctor(Long doctorId);
    List<Appointment> getAppointmentByDate(LocalDate date);
}
