package com.alura.powermanagement.controller;

import com.alura.powermanagement.model.DTO.AddressDTO;
import com.alura.powermanagement.service.AddressService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResponseEntity saveAddress(@Valid @RequestBody AddressDTO addressDTO, @RequestHeader int userId) {
        return addressService.createAddress(addressDTO, userId);
    }

    @GetMapping
    public ResponseEntity getAllAddress() {
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public ResponseEntity getAddressById(@PathVariable(name="id") @NotBlank Integer id){
        return addressService.findById(id);

    }

    @PutMapping("/{id}")
    public ResponseEntity editAddress(@PathVariable(name = "id") @NotBlank Integer id,
            @Valid @RequestBody AddressDTO addressDTO ){

        return addressService.editAddress(id, addressDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAddress(@PathVariable Integer id){

      return addressService.deleteAddress(id);
    }


}
