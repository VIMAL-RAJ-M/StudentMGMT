package com.StudentMangement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.StudentMangement.model.Admin;
import com.StudentMangement.repository.AdminRepository;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        Admin admin = adminRepository.findById(username).orElse(null);
        if (admin != null && admin.getPassword().equals(password)) {
            return ResponseEntity.ok("Login successful as admin");
        } else {
            return ResponseEntity.status(401).body("Invalid username or password");
        }
    }
}