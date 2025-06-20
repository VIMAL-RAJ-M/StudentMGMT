package com.StudentMangement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username; 
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
    private String name;
    private String rollNo;
    private String department;
    private int year;
    private String courses;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRollNo() { return rollNo; }
    public void setRollNo(String rollNo) { this.rollNo = rollNo; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public String getCourses() { return courses; }
    public void setCourses(String courses) { this.courses = courses; }

    public Student() {}
    public Student(String name, String rollNo, String department, int year, String courses) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.year = year;
        this.courses = courses;
    }
}