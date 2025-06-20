package com.StudentMangement.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentMangement.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {}
