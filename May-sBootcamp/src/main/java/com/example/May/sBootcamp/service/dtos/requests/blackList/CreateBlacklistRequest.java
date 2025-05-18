package com.example.May.sBootcamp.service.dtos.requests.blackList;

import java.time.LocalDate;

public class CreateBlacklistRequest {
    private String reason;
    private LocalDate date;
    private Long applicantId;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }
}
