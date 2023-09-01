package com.alura.powermanagement.controller;

import com.alura.powermanagement.model.DTO.PersonDTO;
import com.alura.powermanagement.model.DTO.UserDTO;
import com.alura.powermanagement.service.PersonService;
import com.alura.powermanagement.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity savePerson(@Valid @RequestBody PersonDTO personDTO) {
        //return userService.createUser(userDTO);
        return null;
    }

    @GetMapping
    public ResponseEntity getAllUsers() {
        return personService.getAllPersons();
    }
    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable(name = "id") @NotBlank Integer id) {
        return personService.findById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity editUser(@PathVariable(name = "id") @NotBlank Integer id,
                                   @Valid @RequestBody PersonDTO personDTO ){

        //return userService.editUser(id, userDTO);
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Integer id){
        return personService.deletePerson(id);
    }

}
