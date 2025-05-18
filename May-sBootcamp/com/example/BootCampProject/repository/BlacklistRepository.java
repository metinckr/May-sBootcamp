package com.example.BootCampProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.BootCampProject.entity.Blacklist;

public interface BlacklistRepository extends JpaRepository<Blacklist, Long> {
} 