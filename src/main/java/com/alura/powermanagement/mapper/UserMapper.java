package com.alura.powermanagement.mapper;

import com.alura.powermanagement.model.DTO.UserDTO;
import com.alura.powermanagement.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface UserMapper {

    User userDTOtoEntity(UserDTO userDTO);

}
