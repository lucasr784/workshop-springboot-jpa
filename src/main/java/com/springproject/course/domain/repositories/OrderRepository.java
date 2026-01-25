package com.springproject.course.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.course.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
