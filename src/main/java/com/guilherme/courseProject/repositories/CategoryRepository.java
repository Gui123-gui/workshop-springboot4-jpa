package com.guilherme.courseProject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.courseProject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
