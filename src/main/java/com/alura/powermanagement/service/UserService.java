package com.alura.powermanagement.service;

import com.alura.powermanagement.model.DTO.UserDTO;
import com.alura.powermanagement.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    ResponseEntity createUser(UserDTO userDTO);

    List<User> getAllUsers();

    User findById(Integer id);

    ResponseEntity deleteUser(Integer id);

    ResponseEntity editUser(Integer id, UserDTO userDTO);

}
