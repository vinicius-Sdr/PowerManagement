package com.alura.powermanagement.service.impl;

import com.alura.powermanagement.mapper.ApplianceMapper;
import com.alura.powermanagement.model.Appliance;
import com.alura.powermanagement.model.DTO.ApplianceDTO;
import com.alura.powermanagement.repository.ApplianceRepository;
import com.alura.powermanagement.service.ApplianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplianceServiceImpl implements ApplianceService {

    @Autowired
    private ApplianceMapper mapper;

    @Autowired
    private ApplianceRepository repository;

    @Override
    public ResponseEntity createAppliance(ApplianceDTO applianceDTO) {
        Appliance appliance = mapper.applianceDTOtoEntity(applianceDTO);

        return ResponseEntity.ok().body(repository.save(appliance));

    }

    @Override
    public ResponseEntity getAllAppliances() {
        return ResponseEntity.ok().body(repository.findAll());
    }

    @Override
    public ResponseEntity deleteAppliance(Integer id) {
        repository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Eletronico deletado com sucesso!");
    }

    @Override
    public ResponseEntity editAppliance(Integer id, ApplianceDTO applianceDTO) {
        Optional<Appliance> addressOptional = repository.findById(id);
        if (addressOptional.isPresent()) {
            Appliance appliance = mapper.applianceDTOtoEntity(applianceDTO);
            appliance.setId(id);
            return ResponseEntity.ok().body(repository.save(appliance));
        } else {
            return ResponseEntity.badRequest().body("Numero de id inválido");
        }
    }

    @Override
    public ResponseEntity findById(Integer id) {
        return ResponseEntity.ok().body(repository.findById(id));
    }
}
