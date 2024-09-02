package org.factzoopia.sonarEvents.services;


import org.factzoopia.sonarEvents.exceptions.RoleNotFoundException;
import org.factzoopia.sonarEvents.models.Role;
import org.factzoopia.sonarEvents.repositories.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    
    RoleRepository repository;

    public RoleService(RoleRepository repository) {
        this.repository = repository;
    }

    public Role getById(Long id) {
        Role role = repository.findById(id).orElseThrow(() -> new RoleNotFoundException("Role not found"));
        return role;
    }

}