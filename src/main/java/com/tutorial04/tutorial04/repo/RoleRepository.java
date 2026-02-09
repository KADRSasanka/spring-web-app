package com.tutorial04.tutorial04.repo;

import com.tutorial04.tutorial04.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
