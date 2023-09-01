package com.alura.powermanagement.service.impl;

import com.alura.powermanagement.mapper.PersonMapper;
import com.alura.powermanagement.model.DTO.PersonDTO;
import com.alura.powermanagement.model.Person;
import com.alura.powermanagement.repository.PersonRepository;
import com.alura.powermanagement.service.AddressService;
import com.alura.powermanagement.service.PersonService;
import com.alura.powermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonMapper mapper;

    @Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;

    @Override
    public ResponseEntity createPerson(PersonDTO personDTO) {

        Person person = mapper.personDTOtoEntity(personDTO);
        person.setUser(userService.findById(personDTO.getUserId()));
        person.setAddress(addressService.findById(personDTO.getAddressId()));


        return ResponseEntity.status(HttpStatus.CREATED).body(personRepository.save(person));

    }

    @Override
    public ResponseEntity getAllPersons() {
        return ResponseEntity.ok().body(personRepository.findAll());
    }

    @Override
    public Person findById(Integer id) {
        return personRepository.findById(id).get();
    }

    @Override
    public ResponseEntity deletePerson(Integer id) {

        Optional<Person> person = personRepository.findById(id);
        if (person.isPresent()) {
            personRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Usuário deletado com sucesso!");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Número de Id inválido");

    }

    @Override
    public ResponseEntity editPerson(Integer id, PersonDTO personDTO) {
        Optional<Person> personOptional = personRepository.findById(id);
        if (personOptional.isPresent()) {

            Person person = mapper.personDTOtoEntity(personDTO);
            person.setId(id);
            return ResponseEntity.ok().body(personRepository.save(person));
        } else {
            return ResponseEntity.badRequest().body("Número de id inválido");
        }

    }
}
