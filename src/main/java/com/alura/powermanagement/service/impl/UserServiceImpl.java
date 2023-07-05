package com.alura.powermanagement.service.impl;

import com.alura.powermanagement.mapper.UserMapper;
import com.alura.powermanagement.model.Appliance;
import com.alura.powermanagement.model.DTO.UserDTO;
import com.alura.powermanagement.model.User;
import com.alura.powermanagement.repository.UserRepository;
import com.alura.powermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
        if (userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Usuário deletado com sucesso!");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Número de Id inválido");
    }

    @Override
    public ResponseEntity editUser(Integer id, UserDTO userDTO) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = mapper.userDTOtoEntity(userDTO);
            user.setId(id);
            return ResponseEntity.ok().body(userRepository.save(user));
        } else {
            return ResponseEntity.badRequest().body("Número de id inválido");
        }
    }


}
