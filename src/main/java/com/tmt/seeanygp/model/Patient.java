package com.tmt.seeanygp.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.RequiredArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="patient")
public class Patient {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(name="medical_history")
    private String medicalHistory;

    @NonNull
    @Column(name="medication")
    private String medication;

    @NonNull
    @Column(name="allergies")
    private String allergies;

    @NonNull                    
    @Column(name="family_history")
    private String familyHistory;

    @NonNull
    @Column(name="smoking")
    private String smoking;

    @NonNull
    @Column(name="alcohol")
    private String alcohol;

    @JsonIgnore
    @Column(name="notes")
    private String notes;
    
    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="person_id", referencedColumnName = "id")
    private Person person; 

    @JsonIgnore
    @OneToMany(mappedBy = "patient")
    List<Appointment> appointments;

    @Column(name = "created_on", updatable = false) //nullable = false)
    private LocalDate createdOn;
    
    @Column(name = "updated_on")// nullable = false)
    private LocalDate updatedOn;

}
