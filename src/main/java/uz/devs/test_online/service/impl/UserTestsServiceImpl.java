package uz.devs.test_online.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.devs.test_online.dto.ResponseDto;
import uz.devs.test_online.dto.UserTestsDto;
import uz.devs.test_online.service.UserTestsService;

@Service
@RequiredArgsConstructor
public class UserTestsServiceImpl implements UserTestsService {
    @Override
    public ResponseDto<UserTestsDto> getUserTests(Integer fanId) {
        return null;
    }
}
