package uz.devs.test_online.service.mapper;

import org.mapstruct.Mapper;
import uz.devs.test_online.dto.UserTestsDto;
import uz.devs.test_online.entity.UserTests;

@Mapper(componentModel = "spring")
public interface UserTestsMapper extends CommonMapper<UserTestsDto, UserTests>{
}