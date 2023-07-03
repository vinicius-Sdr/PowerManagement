package com.alura.powermanagement.controller;

import com.alura.powermanagement.model.DTO.AddressDTO;
import com.alura.powermanagement.model.DTO.ApplianceDTO;
import com.alura.powermanagement.service.ApplianceService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appliance")
public class ApplianceController {

    @Autowired
    private ApplianceService service;

    @PostMapping
    public ResponseEntity saveAppliance(@Valid @RequestBody ApplianceDTO applianceDTO) {
        return service.createAppliance(applianceDTO);
    }

    @GetMapping
    public ResponseEntity getAllAppliance() {
        return service.getAllAppliances();
    }

    @GetMapping("/{id}")
    public ResponseEntity getApplianceById(@PathVariable(name="id") @NotBlank Integer id){
        return service.findById(id);

    }

    @PutMapping("/{id}")
    public ResponseEntity editAppliance(@PathVariable(name = "id") @NotBlank Integer id,
                                      @Valid @RequestBody ApplianceDTO applianceDTO ){
        return service.editAppliance(id, applianceDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAppliance(@PathVariable Integer id){

        return service.deleteAppliance(id);
    }


}
