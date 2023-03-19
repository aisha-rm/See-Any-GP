package com.tmt.seeanygp.service;

import java.util.List;

import com.tmt.seeanygp.model.Role;

public interface RoleService {
    
    Role getRole(Long roleId);
    Role saveRole(Role role);
    void deleteRole(Long roleId);
    Role updateRole(Role role);
    List<Role> getRoles();
}
