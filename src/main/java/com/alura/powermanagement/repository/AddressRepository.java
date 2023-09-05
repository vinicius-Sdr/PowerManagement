package com.alura.powermanagement.repository;

import com.alura.powermanagement.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    void deleteById(Integer id);

    public List<Address> findByStreetAndNeighborhoodAndCityAndState(String street, String neighborhood, String city, String state);


}
