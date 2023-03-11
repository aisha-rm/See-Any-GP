package com.tmt.seeanygp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmt.seeanygp.model.Role;


@RestController
@RequestMapping("/role")
public class RoleController {

    @GetMapping("/detail/{id}")
    public ResponseEntity<Role> getRole(@PathVariable Long id) {
        return null;
    }
    
    @PostMapping("/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role Role) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Role> deleteRole(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Role> updateRole(@PathVariable Long id, @RequestBody Role Role) {
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<Role> getAllRoles() {
        return null;
    }
    
}
