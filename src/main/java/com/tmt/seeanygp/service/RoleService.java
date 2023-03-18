package com.tmt.seeanygp.service;

import java.util.List;

import com.tmt.seeanygp.model.Role;

public interface RoleService {
    
    Role getRole(Long RoleId);
    Role saveRole(Role Role);
    void deleteRole(Long RoleId);
    Role updateRole(Role Role);
    List<Role> getRoles();
}
