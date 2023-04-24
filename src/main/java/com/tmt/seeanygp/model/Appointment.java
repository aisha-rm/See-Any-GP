package com.tmt.seeanygp.model;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.RequiredArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="appointment")
public class Appointment {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(name="date", nullable=false)
    private LocalDate date;

    @ManyToOne(//optional = false,
     fetch = FetchType.EAGER)
    @JoinColumn(name="doctor_id", referencedColumnName = "id")
    private Doctor doctor;
    
    @ManyToOne(//optional = false,
        fetch = FetchType.EAGER)
    @JoinColumn(name="patient_id", referencedColumnName = "id")
    private Patient patient;

    @Column(name = "created_on", updatable = false)// nullable = false)
    private LocalDate createdOn;
    
    @Column(name = "updated_on")//, nullable = false)
    private LocalDate updatedOn;

}
