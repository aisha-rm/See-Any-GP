package com.tmt.seeanygp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmt.seeanygp.exception.EntityNotFoundException;
import com.tmt.seeanygp.model.Role;
import com.tmt.seeanygp.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role getRole(Long roleId) {
        Optional<Role> role = roleRepository.findById(roleId);
        return unwrapRole(role, roleId);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(Long roleId) {
        roleRepository.deleteById(roleId);
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getRoles() {
        return (List<Role>) roleRepository.findAll();
    }
    
    static Role unwrapRole(Optional<Role> entity, Long roleId) {
        if (entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(roleId, Role.class);
    }
    
}
