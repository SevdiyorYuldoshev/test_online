package uz.devs.test_online.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.devs.test_online.dto.ResponseDto;
import uz.devs.test_online.dto.UserDto;
import uz.devs.test_online.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseDto<UserDto> addUser(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }
    @GetMapping("/{id}")
    public ResponseDto<UserDto> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
    @GetMapping("/get-all-user")
    public ResponseDto<List<UserDto>> getAllUser(){
        return userService.getAllUsers();
    }
    @PutMapping("/edit-user")
    public ResponseDto<UserDto> editUser(@RequestBody UserDto userDto){
        return userService.editUser(userDto);
    }
    @DeleteMapping("/{id}")
    public ResponseDto<UserDto> deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }

    @DeleteMapping("/delete-all-user")
    public ResponseDto<UserDto> deleteAllUser(){
        return userService.deleteAllUser();
    }
    @PatchMapping("/edit-password")
    public String editPassword(@RequestParam String password, String newPassword){
        return userService.editPassword(password, newPassword);
    }
}
