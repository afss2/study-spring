package com.learningspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningspring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
