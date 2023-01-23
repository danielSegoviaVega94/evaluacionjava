package com.nisum.dsegovia.repository;


import com.nisum.dsegovia.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

     User findByEmail(String email);
}
