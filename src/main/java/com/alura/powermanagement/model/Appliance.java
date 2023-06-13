package com.alura.powermanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appliance {

    @Id
    private Integer Id;

    private String name;

    private String model;

    private String potency;
}
