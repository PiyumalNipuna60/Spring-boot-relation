package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.entity.Subject;

import java.util.List;

public interface SubjectService {
    Long add(Subject dto);

    List<Subject> getAll();

    String update(Subject dt);

    String delete(int Id);
}
