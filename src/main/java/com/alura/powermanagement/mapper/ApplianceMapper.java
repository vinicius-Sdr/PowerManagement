package com.alura.powermanagement.mapper;

import com.alura.powermanagement.model.Appliance;
import com.alura.powermanagement.model.DTO.ApplianceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ApplianceMapper {

    Appliance applianceDTOtoEntity(ApplianceDTO applianceDTO);
}
