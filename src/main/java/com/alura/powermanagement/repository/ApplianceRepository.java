package com.alura.powermanagement.repository;

import com.alura.powermanagement.model.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplianceRepository extends JpaRepository<Appliance, Integer> {

    List<Appliance> findByNameAndModelAndPotency(String name, String model, Double potency);
}
