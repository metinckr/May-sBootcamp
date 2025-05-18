package com.example.May.sBootcamp.service.businessrules;

import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class BootcampBusinessRules {
    public void checkIfStartDateBeforeEndDate(LocalDate start, LocalDate end) {
        if (start.isAfter(end)) {
            throw new RuntimeException("Başlangıç tarihi, bitiş tarihinden önce olmalıdır.");
        }
    }
    public void checkIfBootcampNameExists(boolean exists) {
        if (exists) {
            throw new RuntimeException("Aynı isimde bir bootcamp daha önce açılmışsa tekrar açılamaz.");
        }
    }
    public void checkIfInstructorExists(boolean exists) {
        if (!exists) {
            throw new RuntimeException("Eğitmen sistemde kayıtlı olmalıdır.");
        }
    }
    public void checkIfBootcampOpenForApplication(boolean isOpen) {
        if (!isOpen) {
            throw new RuntimeException("Başvuru durumu 'CLOSED' olan bootcamp'e başvuru alınamaz.");
        }
    }
} 