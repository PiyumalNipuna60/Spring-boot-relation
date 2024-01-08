package com.example.demo.service;

import com.example.demo.entity.StudentDetails;

import java.util.List;

public interface StudentDetailsService {
    Long add(StudentDetails dto);

    List<StudentDetails> getAll();

    String update(StudentDetails dt);

    String delete(int Id);
}
