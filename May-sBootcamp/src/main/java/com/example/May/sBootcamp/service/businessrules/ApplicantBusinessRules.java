package com.example.May.sBootcamp.service.businessrules;

import org.springframework.stereotype.Component;

@Component
public class ApplicantBusinessRules {
    public void checkIfIdentityNumberExists(boolean exists) {
        if (exists) {
            throw new RuntimeException("Aynı TC Kimlik No ile birden fazla başvuru yapılamaz.");
        }
    }
    public void checkIfBlacklisted(boolean isBlacklisted) {
        if (isBlacklisted) {
            throw new RuntimeException("Kara listeye alınan bir başvuru sahibi yeni başvuru yapamaz.");
        }
    }
    public void checkIfApplicantExists(boolean exists) {
        if (!exists) {
            throw new RuntimeException("Sistemde kayıtlı olmayan bir başvuru sahibi ile işlem yapılamaz.");
        }
    }
} 