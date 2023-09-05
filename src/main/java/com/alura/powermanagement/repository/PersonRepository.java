package com.alura.powermanagement.repository;

import com.alura.powermanagement.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    List<Person> findByNameAndKinshipAndGender(String name, String kinship, String gender);

}
