package com.alura.powermanagement.service.impl;

import com.alura.powermanagement.mapper.AddressMapper;
import com.alura.powermanagement.model.Address;
import com.alura.powermanagement.model.DTO.AddressDTO;
import com.alura.powermanagement.repository.AddressRepository;
import com.alura.powermanagement.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper mapper;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public ResponseEntity createAddress(AddressDTO addressDTO) {

    Address address = mapper.addressDTOtoEntity(addressDTO);

        return ResponseEntity.ok().body(addressRepository.save(address));
    }

    @Override
    public ResponseEntity getAllAddress() {
        return ResponseEntity.ok().body(addressRepository.findAll());
    }

    @Override
    public ResponseEntity findById(Integer id) {

        return ResponseEntity.ok().body(addressRepository.findById(id));
    }

    @Override
    public ResponseEntity deleteAddress(Integer id) {
        addressRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Endereço deletado com sucesso!");
    }

    @Override
    public ResponseEntity editAddress(Integer id, AddressDTO addressDTO) {
        return null;
    }
}
