package com.example.May.sBootcamp.service.businessrules;

import org.springframework.stereotype.Component;

@Component
public class ApplicationBusinessRules {
    public void checkIfAlreadyApplied(boolean exists) {
        if (exists) {
            throw new RuntimeException("Aynı kişi aynı bootcamp'e birden fazla başvuru yapamaz.");
        }
    }
    public void checkIfBootcampActive(boolean isActive) {
        if (!isActive) {
            throw new RuntimeException("Başvuru yapılan bootcamp aktif olmalıdır.");
        }
    }
    public void checkIfApplicantBlacklisted(boolean isBlacklisted) {
        if (isBlacklisted) {
            throw new RuntimeException("Kara listeye alınmış bir aday başvuru yapamaz.");
        }
    }
    public void checkIfStatusTransitionValid(String from, String to) {
        if (from.equals("CANCELLED") && to.equals("PENDING")) {
            throw new RuntimeException("Başvurunun durumu CANCELLED'dan PENDING'e geçirilemez.");
        }
        // Diğer geçiş kuralları burada eklenebilir
    }
} 