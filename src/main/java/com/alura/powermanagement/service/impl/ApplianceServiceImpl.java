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

import java.util.List;
import java.util.Optional;

@Service
public class ApplianceServiceImpl implements ApplianceService {

    @Autowired
    private ApplianceMapper mapper;

    @Autowired
    private ApplianceRepository applianceRepositoryrepository;

    @Override
    public ResponseEntity createAppliance(ApplianceDTO applianceDTO) {
        Appliance appliance = mapper.applianceDTOtoEntity(applianceDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(applianceRepositoryrepository.save(appliance));

    }

    @Override
    public ResponseEntity getAllAppliances() {
        return ResponseEntity.ok().body(applianceRepositoryrepository.findAll());
    }

    @Override
    public ResponseEntity deleteAppliance(Integer id) {
        if (applianceRepositoryrepository.findById(id).isPresent()) {
            applianceRepositoryrepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Eletronico deletado com sucesso!");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Número de Id inválido");
    }

    @Override
    public ResponseEntity editAppliance(Integer id, ApplianceDTO applianceDTO) {
        Optional<Appliance> applianceOptional = applianceRepositoryrepository.findById(id);
        if (applianceOptional.isPresent()) {
            Appliance appliance = mapper.applianceDTOtoEntity(applianceDTO);
            appliance.setId(id);
            return ResponseEntity.ok().body(applianceRepositoryrepository.save(appliance));
        } else {
            return ResponseEntity.badRequest().body("Numero de id inválido");
        }
    }

    @Override
    public ResponseEntity findById(Integer id) {
        return ResponseEntity.ok().body(applianceRepositoryrepository.findById(id));
    }

    @Override
    public ResponseEntity getAppliances(String name, String model, double potency) {

        List<Appliance> applianceList = applianceRepositoryrepository.findByNameAndModelAndPotency(name, model, potency);

        if(!applianceList.isEmpty()){
            return ResponseEntity.ok().body(applianceList);
        }else{
            return ResponseEntity.ok(HttpStatus.NOT_FOUND);
        }
    }
}
