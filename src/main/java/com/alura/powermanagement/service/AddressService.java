package com.alura.powermanagement.service;

import com.alura.powermanagement.model.Address;
import com.alura.powermanagement.model.DTO.AddressDTO;
import org.springframework.http.ResponseEntity;

public interface AddressService {

    ResponseEntity createAddress(AddressDTO addressDTO);

    ResponseEntity getAllAddress();

    Address findById(Integer id);

    ResponseEntity deleteAddress(Integer id);

    ResponseEntity editAddress(Integer id, AddressDTO addressDTO);
}
