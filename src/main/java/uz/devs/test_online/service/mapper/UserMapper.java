package uz.devs.test_online.service.mapper;

import org.mapstruct.Mapper;
import uz.devs.test_online.dto.UserDto;
import uz.devs.test_online.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper extends CommonMapper<UserDto, User>{
}
