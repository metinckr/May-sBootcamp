package com.example.May.sBootcamp.service.mappers;

import com.example.May.sBootcamp.entity.Application;
import com.example.May.sBootcamp.service.dtos.requests.application.CreateApplicationRequest;
import com.example.May.sBootcamp.service.dtos.responses.application.GetApplicationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "applicationState", constant = "PENDING")
    Application createApplicationRequestToApplication(CreateApplicationRequest request);

    GetApplicationResponse applicationToGetApplicationResponse(Application application);
}
