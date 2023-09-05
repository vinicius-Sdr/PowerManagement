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
    private ApplianceService applianceServiceservice;

    @PostMapping
    public ResponseEntity saveAppliance(@Valid @RequestBody ApplianceDTO applianceDTO) {
        return applianceServiceservice.createAppliance(applianceDTO);
    }

//    @GetMapping
//    public ResponseEntity getAllAppliance() {
//        return applianceServiceservice.getAllAppliances();
//    }

    @GetMapping("/{id}")
    public ResponseEntity getApplianceById(@PathVariable(name="id") @NotBlank Integer id){
        return applianceServiceservice.findById(id);

    }

    @PutMapping("/{id}")
    public ResponseEntity editAppliance(@PathVariable(name = "id") @NotBlank Integer id,
                                      @Valid @RequestBody ApplianceDTO applianceDTO ){
        return applianceServiceservice.editAppliance(id, applianceDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAppliance(@PathVariable Integer id){

        return applianceServiceservice.deleteAppliance(id);
    }

    @GetMapping
    public ResponseEntity getAddresses(@Valid @RequestParam(required = false) String name, @Valid @RequestParam(required = false) String model, @Valid @RequestParam(required = false) double potency) {

        return applianceServiceservice.getAppliances(name, model, potency);
    }


}
