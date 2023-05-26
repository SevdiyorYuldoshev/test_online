package uz.devs.test_online.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.devs.test_online.dto.ResponseDto;
import uz.devs.test_online.dto.UserDto;
import uz.devs.test_online.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public ResponseDto<UserDto> addUser(UserDto userDto) {
        return null;
    }

    @Override
    public ResponseDto<UserDto> getUserById(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<List<UserDto>> getAllUsers() {
        return null;
    }

    @Override
    public ResponseDto<UserDto> editUser(UserDto userDto) {
        return null;
    }

    @Override
    public ResponseDto<UserDto> deleteUser(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<UserDto> deleteAllUser() {
        return null;
    }

    @Override
    public String editPassword(String password, String newPassword) {
        return null;
    }
}
