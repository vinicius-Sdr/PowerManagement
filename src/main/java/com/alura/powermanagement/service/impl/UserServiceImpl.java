package com.alura.powermanagement.service.impl;

import com.alura.powermanagement.mapper.UserMapper;
import com.alura.powermanagement.model.DTO.UserDTO;
import com.alura.powermanagement.model.User;
import com.alura.powermanagement.repository.UserRepository;
import com.alura.powermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity createUser(UserDTO userDTO) {

    User user = mapper.userDTOtoEntity(userDTO);

        return ResponseEntity.ok().body(userRepository.save(user));
    }

    @Override
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok().body(userRepository.findAll());
    }

    @Override
    public ResponseEntity findById(Integer id) {
        return ResponseEntity.ok().body(userRepository.findById(id));
    }

    @Override
    public ResponseEntity deleteUser(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity editUser(Integer id, UserDTO userDTO) {
        return null;
    }

    @Override
    public ResponseEntity editAddress(Integer id, UserDTO userDTO) {
        return null;
    }

    @Override
    public ResponseEntity deleteAddress(Integer id) {
        return null;
    }

}
