package com.example.May.sBootcamp.repository;

import com.example.BootCampProject.entity.Application;
import com.example.BootCampProject.entity.ApplicationState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application,Long> {
    List<Application> findByApplicantId(Long applicantId);
    List<Application> findByBootcampId(Long bootcampId);
    List<Application> findByApplicationState(ApplicationState state);
    List<Application> findByApplicantIdAndIsDeletedFalse(Long applicantId);
    List<Application> findByBootcampIdAndIsDeletedFalse(Long bootcampId);
    List<Application> findByApplicationStateAndIsDeletedFalse(ApplicationState state);
    List<Application> findAllByIsDeletedFalse();

    // JPQL örneği: Sadece aktif (isDeleted=false) başvuruları getirir
    @Query("SELECT a FROM Application a WHERE a.isDeleted = false")
    List<Application> getAllActiveApplicationsJPQL();

    // Native SQL örneği: Sadece aktif (isDeleted=false) başvuruları getirir
    @Query(value = "SELECT * FROM applications WHERE is_deleted = false", nativeQuery = true)
    List<Application> getAllActiveApplicationsNative();
}
