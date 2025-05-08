package com.springboot.starterapi.repository;

import com.springboot.starterapi.model.role.Role;
import com.springboot.starterapi.model.role.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(RoleName name);
}
