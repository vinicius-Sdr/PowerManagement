package com.alura.powermanagement.mapper;

import com.alura.powermanagement.model.Address;
import com.alura.powermanagement.model.DTO.AddressDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface AddressMapper {

    Address addressDTOtoEntity(AddressDTO addressDTO);


}
