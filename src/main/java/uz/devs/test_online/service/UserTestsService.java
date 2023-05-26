package uz.devs.test_online.service;

import uz.devs.test_online.dto.ResponseDto;
import uz.devs.test_online.dto.UserTestsDto;

public interface UserTestsService {
    ResponseDto<UserTestsDto> getUserTests(Integer fanId);
}
