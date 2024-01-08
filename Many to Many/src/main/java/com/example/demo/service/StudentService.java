package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    Long add(Student dto);

    List<Student> getAll();

    String update(Student dt);

    String delete(int Id);
}
