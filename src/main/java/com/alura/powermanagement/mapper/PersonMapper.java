package com.alura.powermanagement.mapper;

import com.alura.powermanagement.model.DTO.PersonDTO;
import com.alura.powermanagement.model.DTO.UserDTO;
import com.alura.powermanagement.model.Person;
import com.alura.powermanagement.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface PersonMapper {

    Person personDTOtoEntity(PersonDTO personDTO);
}
