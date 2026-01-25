package com.springproject.course.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.course.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
