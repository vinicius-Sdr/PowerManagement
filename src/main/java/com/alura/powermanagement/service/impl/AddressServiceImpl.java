package com.alura.powermanagement.service.impl;

import com.alura.powermanagement.mapper.AddressMapper;
import com.alura.powermanagement.model.Address;
import com.alura.powermanagement.model.DTO.AddressDTO;
import com.alura.powermanagement.model.User;
import com.alura.powermanagement.repository.AddressRepository;
import com.alura.powermanagement.service.AddressService;
import com.alura.powermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper mapper;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserService userService;


    @Override
    public ResponseEntity createAddress(AddressDTO addressDTO) {

        User user = userService.findById(addressDTO.getUserId());

        Address address = mapper.addressDTOtoEntity(addressDTO);
        address.setUser(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(addressRepository.save(address));
    }

    @Override
    public ResponseEntity getAllAddress() {
        return ResponseEntity.ok().body(addressRepository.findAll());
    }

    @Override
    public Address findById(Integer id) {

        return addressRepository.findById(id).get();
    }

    @Override
    public ResponseEntity deleteAddress(Integer id) {
        if (addressRepository.findById(id).isPresent()) {
            addressRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Endereço deletado com sucesso!");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Número de Id inválido");
    }
    @Override
    public ResponseEntity editAddress(Integer id, AddressDTO addressDTO) {
        Optional<Address> addressOptional = addressRepository.findById(id);
        if (addressOptional.isPresent()) {
            Address address = mapper.addressDTOtoEntity(addressDTO);
            address.setId(id);
            return ResponseEntity.ok().body(addressRepository.save(address));
        }else{
        return ResponseEntity.badRequest().body("Numero de id inválido");
        }

    }
}
