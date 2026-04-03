package com.guilherme.courseProject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.courseProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
