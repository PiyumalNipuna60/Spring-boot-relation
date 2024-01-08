package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentDetails;
import com.example.demo.repo.StudentDetailsRepo;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentDetailsService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {

    @Autowired
    private StudentDetailsRepo studentDetailsRepo;

    @Override
    public Long add(StudentDetails dto) {
        StudentDetails customer = new StudentDetails(
                dto.getId(),
                dto.getStudent(),
                dto.getSubject()
        );

        StudentDetails save = studentDetailsRepo.save(customer);
        return save.getId();
    }

    @Override
    public List<StudentDetails> getAll() {
        return null;
    }

    @Override
    public String update(StudentDetails dt) {
        return null;
    }

    @Override
    public String delete(int Id) {
        return null;
    }
}
