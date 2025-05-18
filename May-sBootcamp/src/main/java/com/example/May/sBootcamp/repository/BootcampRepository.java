package com.example.May.sBootcamp.repository;

import com.example.BootCampProject.entity.Bootcamp;
import com.example.BootCampProject.entity.BootcampState;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BootcampRepository extends JpaRepository<Bootcamp,Long> {
    List<Bootcamp> findByInstructorId(Long instructorId);
    List<Bootcamp> findByBootcampState(BootcampState state);
    List<Bootcamp> findByEndDateBefore(LocalDate date);
    List<Bootcamp> findByInstructorIdAndIsDeletedFalse(Long instructorId);
    List<Bootcamp> findByBootcampStateAndIsDeletedFalse(BootcampState state);
    List<Bootcamp> findByEndDateBeforeAndIsDeletedFalse(LocalDate date);
    List<Bootcamp> findAllByIsDeletedFalse();
}
