package com.example.May.sBootcamp.service.commands;

import com.example.BootCampProject.entity.Application;
import com.example.BootCampProject.repository.ApplicationRepository;
import com.example.BootCampProject.service.dtos.requests.application.CreateApplicationRequest;
import com.example.BootCampProject.service.dtos.responses.application.GetApplicationResponse;
import com.example.BootCampProject.service.mappers.ApplicationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationCommandServiceImpl implements ApplicationCommandService {
    private final ApplicationRepository applicationRepository;
    private final ApplicationMapper applicationMapper;

    @Override
    public GetApplicationResponse createApplication(CreateApplicationRequest request) {
        Application application = applicationMapper.createApplicationRequestToApplication(request);
        Application savedApplication = applicationRepository.save(application);
        return applicationMapper.applicationToGetApplicationResponse(savedApplication);
    }

    @Override
    public GetApplicationResponse updateApplication(Long id, CreateApplicationRequest request) {
        Application application = applicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found"));
        application.setApplicantId(request.getApplicantId());
        application.setBootcampId(request.getBootcampId());
        Application updatedApplication = applicationRepository.save(application);
        return applicationMapper.applicationToGetApplicationResponse(updatedApplication);
    }

    @Override
    public void deleteApplication(Long id) {
        Application application = applicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found"));
        application.setDeleted(true);
        applicationRepository.save(application);
    }
} 