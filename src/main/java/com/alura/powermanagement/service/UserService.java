package com.alura.powermanagement.service;

import com.alura.powermanagement.model.DTO.UserDTO;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity createUser(UserDTO userDTO);

    ResponseEntity getAllUsers();

    ResponseEntity findById(Integer id);

    ResponseEntity deleteUser(Integer id);

    ResponseEntity editUser(Integer id, UserDTO userDTO);

}
