package com.springproject.course.domain.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.springproject.course.domain.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<UserDetails> findUserByEmail(String username);

}
