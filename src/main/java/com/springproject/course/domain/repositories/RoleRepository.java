package com.springproject.course.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.course.domain.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
