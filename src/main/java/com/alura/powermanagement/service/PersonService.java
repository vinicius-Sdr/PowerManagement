package com.alura.powermanagement.service;

import com.alura.powermanagement.model.DTO.PersonDTO;
import com.alura.powermanagement.model.Person;
import org.springframework.http.ResponseEntity;

public interface PersonService {

    ResponseEntity createPerson(PersonDTO personDTO);

    ResponseEntity getAllPersons();

    Person findById(Integer id);

    ResponseEntity deletePerson(Integer id);

    ResponseEntity editPerson(Integer id, PersonDTO personDTO);

    ResponseEntity getPersons(String name, String kinship, String gender);
}
