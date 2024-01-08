package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo customerRepo;

    @Override
    public Long add(Student dto) {
        Student customer = new Student(
                dto.getId(),
                dto.getName(),
                dto.getAddress(),
                dto.getContact()
        );

        Student save = customerRepo.save(customer);
        return save.getId();
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public String update(Student dt) {
        return null;
    }

    @Override
    public String delete(int cusId) {
        return null;
    }
}
