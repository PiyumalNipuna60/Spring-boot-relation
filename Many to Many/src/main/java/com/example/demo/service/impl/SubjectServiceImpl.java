package com.example.demo.service.impl;

import com.example.demo.entity.Subject;
import com.example.demo.repo.SubjectRepo;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;

    @Override
    public Long add(Subject dto) {
        Subject sub = new Subject(
                dto.getId(),
                dto.getName()
        );

        Subject save = subjectRepo.save(sub);
        return save.getId();
    }

    @Override
    public List<Subject> getAll() {
        return null;
    }

    @Override
    public String update(Subject dt) {
        return null;
    }

    @Override
    public String delete(int Id) {
        return null;
    }
}
