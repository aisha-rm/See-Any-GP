package com.tmt.seeanygp;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tmt.seeanygp.model.Appointment;
import com.tmt.seeanygp.model.Doctor;
import com.tmt.seeanygp.model.Patient;
import com.tmt.seeanygp.repository.AppointmentRepository;
import com.tmt.seeanygp.repository.DoctorRepository;
import com.tmt.seeanygp.repository.PatientRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@SpringBootApplication
public class SeeAnyGpApplication implements CommandLineRunner {

	AppointmentRepository appointmentRepository;
	DoctorRepository doctorRepository;
	PatientRepository patientRepository;


	public static void main(String[] args) {
		SpringApplication.run(SeeAnyGpApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
		Appointment[] appointments = new Appointment[] {
			new Appointment(LocalDate.parse(("2023-03-21"))),
			new Appointment(LocalDate.parse(("2023-03-22"))),
			new Appointment(LocalDate.parse(("2023-03-23"))),
			new Appointment(LocalDate.parse(("2023-03-24")))
		};

		for(int i = 0; i < appointments.length; i++){
			appointmentRepository.save(appointments[i]);
		}

		Doctor[] doctors = new Doctor[] {
			new Doctor((long) 21676335, LocalDate.parse(("2017")), "digital health"), 
			new Doctor((long) 31676345, LocalDate.parse(("2015")), "dermatology"), 
			new Doctor((long) 41676325, LocalDate.parse(("2013")), "mental health"), 
			new Doctor((long) 51676315, LocalDate.parse(("2010")), "digital health"), 
			new Doctor((long) 71676305, LocalDate.parse(("2012")), "women's health")
		};

		for (int i = 0; i < doctors.length; i++) {
			doctorRepository.save(doctors[i]);
		}

		Patient[] patients = new Patient[] {
			new Patient(null, null, null, "hypertension", "no", "no" ),
			new Patient("reflux", "omeprazole", null, "hypertension", "no", "no" ),
			new Patient("heart failure", "furosemide", "penicillin", "hypertension, diabetes", "yes", "no" ),
			new Patient("liver disease", null, null, "liver cancer", "yes", "yes" )
		};

		for (int i = 0; i < patients.length; i++) {
			patientRepository.save(patients[i]);
		}
	}
}
