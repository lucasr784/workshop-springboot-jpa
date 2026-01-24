package com.springproject.course.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.springproject.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<UserDetails> findUserByEmail(String username);

}
