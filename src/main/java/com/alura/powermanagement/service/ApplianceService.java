package com.alura.powermanagement.service;

import com.alura.powermanagement.model.DTO.ApplianceDTO;
import org.springframework.http.ResponseEntity;

public interface ApplianceService {
    ResponseEntity createAppliance(ApplianceDTO applianceDTO);

    ResponseEntity getAllAppliances();

    ResponseEntity deleteAppliance(Integer id);

    ResponseEntity editAppliance(Integer id, ApplianceDTO addressDTO);

    ResponseEntity findById(Integer id);

    ResponseEntity getAppliances(String name, String model, double potency);
}
