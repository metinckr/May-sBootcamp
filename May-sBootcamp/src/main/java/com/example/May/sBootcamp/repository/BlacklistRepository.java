package com.example.May.sBootcamp.repository;

import com.example.BootCampProject.entity.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlacklistRepository extends JpaRepository<Blacklist,Long> {
    List<Blacklist> findByApplicantId(Long applicantId);
    boolean existsByApplicantId(Long applicantId);
    List<Blacklist> findByApplicantIdAndIsDeletedFalse(Long applicantId);
    boolean existsByApplicantIdAndIsDeletedFalse(Long applicantId);
    List<Blacklist> findAllByIsDeletedFalse();
}
