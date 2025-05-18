package com.example.BootCampProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.BootCampProject.entity.Bootcamp;

public interface BootcampRepository extends JpaRepository<Bootcamp, Long> {
} 