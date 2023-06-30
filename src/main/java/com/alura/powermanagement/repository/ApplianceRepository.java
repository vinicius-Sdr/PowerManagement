package com.alura.powermanagement.repository;

import com.alura.powermanagement.model.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplianceRepository extends JpaRepository<Appliance, Integer> {
}
