package uz.devs.test_online.service;

import uz.devs.test_online.dto.ResponseDto;
import uz.devs.test_online.dto.UserDto;

import java.util.List;

public interface UserService {
    ResponseDto<UserDto> addUser(UserDto userDto);

    ResponseDto<UserDto> getUserById(Integer id);

    ResponseDto<List<UserDto>> getAllUsers();

    ResponseDto<UserDto> editUser(UserDto userDto);

    ResponseDto<UserDto> deleteUser(Integer id);

    ResponseDto<UserDto> deleteAllUser();

    String editPassword(String password, String newPassword);
}
