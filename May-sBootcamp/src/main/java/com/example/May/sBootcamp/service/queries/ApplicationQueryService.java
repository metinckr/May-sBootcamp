package com.example.May.sBootcamp.service.queries;

import com.example.BootCampProject.service.dtos.responses.application.GetApplicationResponse;
import java.util.List;

public interface ApplicationQueryService {
    GetApplicationResponse getApplicationById(Long id);
    List<GetApplicationResponse> getAllApplications();
} 