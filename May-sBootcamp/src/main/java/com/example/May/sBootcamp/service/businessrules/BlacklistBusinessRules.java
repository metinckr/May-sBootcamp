package com.example.May.sBootcamp.service.businessrules;

import org.springframework.stereotype.Component;

@Component
public class BlacklistBusinessRules {
    public void checkIfActiveBlacklistExists(boolean exists) {
        if (exists) {
            throw new RuntimeException("Aynı aday için birden fazla aktif kara liste kaydı olamaz.");
        }
    }
    public void checkIfReasonNotEmpty(String reason) {
        if (reason == null || reason.trim().isEmpty()) {
            throw new RuntimeException("Sebep (reason) boş bırakılamaz.");
        }
    }
} 