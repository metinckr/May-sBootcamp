package com.example.May.sBootcamp.service.commands;

import com.example.BootCampProject.service.dtos.requests.application.CreateApplicationRequest;
import com.example.BootCampProject.service.dtos.responses.application.GetApplicationResponse;

public interface ApplicationCommandService {
    GetApplicationResponse createApplication(CreateApplicationRequest request);
    GetApplicationResponse updateApplication(Long id, CreateApplicationRequest request);
    void deleteApplication(Long id);
} 