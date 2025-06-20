package com.StudentMangement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentMangement.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByUsernameAndPassword(String username, String password);
    Optional<Student> findByUsername(String username);
}