package com.guilherme.courseProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.guilherme.courseProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
