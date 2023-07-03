package com.alura.powermanagement.repository;

import com.alura.powermanagement.model.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplianceRepository extends JpaRepository<Appliance, Integer> {
}
