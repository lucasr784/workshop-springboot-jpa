package com.springproject.course.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.course.domain.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
