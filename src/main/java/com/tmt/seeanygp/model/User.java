package com.tmt.seeanygp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "first name cannot be blank")
    @Column(nullable = false)
    private String firstname;
    
    @NotBlank(message = "last name cannot be blank")
    @Column(nullable = false)
    private String lastname;

    @NotBlank(message = "username cannot be blank")
    @Column(nullable = false, unique = true)
    private String username;

    @NotBlank(message = "password cannot be blank")
    @Column(nullable = false)
    private String password;
    
}
