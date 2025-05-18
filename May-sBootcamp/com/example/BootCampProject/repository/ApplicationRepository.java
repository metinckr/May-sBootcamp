package com.example.BootCampProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.BootCampProject.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
} 