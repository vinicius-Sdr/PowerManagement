package com.alura.powermanagement.controller;

import com.alura.powermanagement.model.DTO.PersonDTO;
import com.alura.powermanagement.model.DTO.UserDTO;
import com.alura.powermanagement.service.PersonService;
import com.alura.powermanagement.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity savePerson(@Valid @RequestBody PersonDTO personDTO) {
        return personService.createPerson(personDTO);
    }

//    @GetMapping
//    public ResponseEntity getAllUsers() {
//        return personService.getAllPersons();
//    }

    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable(name = "id") @NotBlank Integer id) {
        return ResponseEntity.ok().body(personService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity editUser(@PathVariable(name = "id") @NotBlank Integer id,
                                   @Valid @RequestBody PersonDTO personDTO) {

        return personService.editPerson(id, personDTO);

    }


    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable Integer id) {
        return personService.deletePerson(id);
    }

    @GetMapping
    public ResponseEntity getAddresses(@Valid @RequestParam(required = false) String name, @Valid @RequestParam(required = false) String kinship, @Valid @RequestParam(required = false) String gender) {

        return personService.getPersons(name, kinship, gender);
    }

}
