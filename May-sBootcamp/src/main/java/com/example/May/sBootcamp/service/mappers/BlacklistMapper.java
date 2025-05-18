package com.example.May.sBootcamp.service.mappers;

import com.example.May.sBootcamp.entity.Blacklist;
import com.example.May.sBootcamp.service.dtos.requests.blackList.CreateBlacklistRequest;
import com.example.May.sBootcamp.service.dtos.responses.blackList.GetBlacklistResponse;
import org.springframework.web.bind.annotation.Mapping;


@Mapper(componentModel = "spring")
public interface BlacklistMapper {
    @Mapping(target = "id", ignore = true)
    Blacklist createBlacklistRequestToBlacklist(CreateBlacklistRequest request);

    GetBlacklistResponse blacklistToGetBlacklistResponse(Blacklist blacklist);
}
