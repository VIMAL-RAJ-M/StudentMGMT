package com.StudentMangement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentMangement.model.Student;
import com.StudentMangement.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> updateStudent(Long id, Student student) {
        return studentRepository.findById(id).map(s -> {
            s.setName(student.getName());
            s.setRollNo(student.getRollNo());
            s.setDepartment(student.getDepartment());
            s.setYear(student.getYear());
            s.setCourses(student.getCourses());
            s.setUsername(student.getUsername());
            s.setPassword(student.getPassword());
            return studentRepository.save(s);
        });
    }


    public boolean deleteStudent(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<Student> getStudentByUsernameAndPassword(String username, String password) {
        return studentRepository.findByUsernameAndPassword(username, password);
    }

    public Optional<Student> getStudentByUsername(String username) {
        return studentRepository.findByUsername(username);
    }

    

}