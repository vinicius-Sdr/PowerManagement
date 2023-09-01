package com.alura.powermanagement.mapper;

import com.alura.powermanagement.model.DTO.PersonDTO;
import com.alura.powermanagement.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface PersonMapper {

    @Mapping(target = "birthDate", dateFormat = "dd/MM/yyyy")
    Person personDTOtoEntity(PersonDTO personDTO);

}
