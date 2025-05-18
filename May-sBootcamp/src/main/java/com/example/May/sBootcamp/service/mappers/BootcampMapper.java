package com.example.May.sBootcamp.service.mappers;

import com.example.May.sBootcamp.entity.Bootcamp;
import com.example.May.sBootcamp.service.dtos.requests.bootCamp.CreateBootcampRequest;
import com.example.May.sBootcamp.service.dtos.responses.bootCamp.GetBootcampResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BootcampMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "bootcampState", constant = "PREPARING")
    Bootcamp createBootcampRequestToBootcamp(CreateBootcampRequest request);

    GetBootcampResponse bootcampToGetBootcampResponse(Bootcamp bootcamp);
}
