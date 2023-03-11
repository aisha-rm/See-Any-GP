package com.tmt.seeanygp.model;

import java.time.LocalDate;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="patient")
public class Patient {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="medical_history")
    private String medicalHistory;

    @Column(name="medication")
    private String medication;

    @Column(name="allergies")
    private String allergies;

    @Column(name="family_history")
    private String familyHistory;

    @Column(name="smoking")
    private String smoking;

    @Column(name="alcohol")
    private String alcohol;
    
    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="person_id", referencedColumnName = "id")
    private Person person; 

    @JsonIgnore
    @Column(name="notes")
    private String notes;

    @Column(name = "created_on", updatable = false, nullable = false)
    private LocalDate createdOn;
    
    @Column(name = "updated_on", nullable = false)
    private LocalDate updatedOn;

}
