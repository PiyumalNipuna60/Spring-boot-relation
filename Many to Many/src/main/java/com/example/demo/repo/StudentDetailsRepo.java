package com.example.demo.repo;

import com.example.demo.entity.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetailsRepo extends JpaRepository<StudentDetails, Long> {
}
