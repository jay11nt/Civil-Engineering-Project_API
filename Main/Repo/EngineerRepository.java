package com.example.civil.repository;

import com.example.civil.entity.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineerRepository extends JpaRepository<Engineer, Long> {
}
