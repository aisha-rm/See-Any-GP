package com.tmt.seeanygp.model;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="doctor")
public class Doctor {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="gmc_number", updatable=false, unique=true, nullable=false)
    private int gmcNumber;

    @Column(name="date_of_graduation", updatable=false)
    private LocalDate dateOfGraduation;

    @Column(name="special_interests")
    private String specialInterests;

    @OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="person_id", referencedColumnName = "id")
    private Person person; 

    @Column(name = "created_on", updatable = false, nullable = false)
    private LocalDate createdOn;
    
    @Column(name = "updated_on", nullable = false)
    private LocalDate updatedOn;
    
}
