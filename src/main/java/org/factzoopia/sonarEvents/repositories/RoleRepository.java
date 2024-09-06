package org.factzoopia.sonarEvents.repositories;


import org.factzoopia.sonarEvents.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
    
}