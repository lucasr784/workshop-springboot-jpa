package com.springproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.course.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
