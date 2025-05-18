package com.example.May.sBootcamp.service.queries;

import com.example.BootCampProject.repository.ApplicationRepository;
import com.example.BootCampProject.service.dtos.responses.application.GetApplicationResponse;
import com.example.BootCampProject.service.mappers.ApplicationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ApplicationQueryServiceImpl implements ApplicationQueryService {
    private final ApplicationRepository applicationRepository;
    private final ApplicationMapper applicationMapper;

    @Override
    public GetApplicationResponse getApplicationById(Long id) {
        return applicationRepository.findById(id)
                .map(applicationMapper::applicationToGetApplicationResponse)
                .orElseThrow(() -> new RuntimeException("Application not found"));
    }

    @Override
    public List<GetApplicationResponse> getAllApplications() {
        return applicationRepository.findAllByIsDeletedFalse().stream()
                .map(applicationMapper::applicationToGetApplicationResponse)
                .collect(Collectors.toList());
    }
} 