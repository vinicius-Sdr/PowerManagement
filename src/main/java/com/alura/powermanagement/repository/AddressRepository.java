package com.alura.powermanagement.repository;

import com.alura.powermanagement.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    void deleteById(Integer id);
}
