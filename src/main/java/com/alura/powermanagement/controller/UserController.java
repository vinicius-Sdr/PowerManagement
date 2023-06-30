package com.alura.powermanagement.controller;

import com.alura.powermanagement.model.DTO.AddressDTO;
import com.alura.powermanagement.model.DTO.UserDTO;
import com.alura.powermanagement.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity saveUser(@Valid @RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @GetMapping
    public ResponseEntity getAllUsers() {

        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable(name = "id") @NotBlank Integer id) {
        return userService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity editAddress(@PathVariable(name = "id") @NotBlank Integer id,
                                      @Valid @RequestBody UserDTO userDTO ){

        return userService.editAddress(id, userDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAddress(@PathVariable Integer id){

        return userService.deleteAddress(id);
    }

}
