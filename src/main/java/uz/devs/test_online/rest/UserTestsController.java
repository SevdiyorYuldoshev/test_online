package uz.devs.test_online.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.devs.test_online.dto.ResponseDto;
import uz.devs.test_online.dto.UserTestsDto;
import uz.devs.test_online.service.UserTestsService;

@RestController
@RequestMapping("/user-tests")
@RequiredArgsConstructor
public class UserTestsController {
    private final UserTestsService userTestsService;
    @GetMapping("/get-tests")
    public ResponseDto<UserTestsDto> getUserTests(@RequestParam Integer fanId){
        return userTestsService.getUserTests(fanId);
    }
}
