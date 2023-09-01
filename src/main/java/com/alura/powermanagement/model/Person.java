package com.alura.powermanagement.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Entity(name = "Person")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    //parentesco
    private String kinship;

    private String gender;

    private Date birthDate;

    @ManyToOne
    @JoinColumn(name = "address_id")
    @JsonBackReference
    private Address address;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private User user;


}
