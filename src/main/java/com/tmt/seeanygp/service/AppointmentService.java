package com.tmt.seeanygp.service;

import java.time.LocalDate;
import java.util.List;
import com.tmt.seeanygp.model.Appointment;


public interface AppointmentService {

    Appointment getAppointment(Long appointmentId);
    Appointment saveAppointment(Appointment appointment);
    Appointment updateAppointment(Appointment appointment);
    void deleteAppointment(Long appointmentId);
    List<Appointment> getAllAppointments(); 
    List<Appointment> getAppointmentByPatient(Long patientId);
    List<Appointment> getAppointmentByDoctor(Long doctorId);
    List<Appointment> getAppointmentByDate(LocalDate date);
}
