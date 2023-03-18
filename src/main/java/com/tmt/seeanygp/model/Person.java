package com.tmt.seeanygp.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="person")

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;


    @Column(name ="date_of_birth", nullable = false, updatable = false)
    @Past(message = "The birth date must be in the past")
    private LocalDate dateOfBirth;

    @Column(name="address")
    private String address;

    @Column(name = "email", nullable = false, unique=true)
    private String email;

    @Column(name ="phone_number", nullable = false)
    private String phoneNumber;

    @ManyToOne(optional = false)
    @JoinColumn(name = "role_id", referencedColumnName = "id", updatable = false)
    private Role role;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on", updatable = false, nullable = false)
    private LocalDate createdOn;

    //@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_on", nullable = false)
    private LocalDate updatedOn;


}
