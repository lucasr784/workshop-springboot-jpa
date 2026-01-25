package com.springproject.course.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.course.domain.entities.OrderItem;
import com.springproject.course.domain.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {


}
