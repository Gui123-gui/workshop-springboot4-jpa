package com.guilherme.courseProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.courseProject.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
