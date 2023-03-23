package com.learningspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningspring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
