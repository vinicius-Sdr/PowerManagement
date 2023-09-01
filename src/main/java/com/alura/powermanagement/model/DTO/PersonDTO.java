package com.alura.powermanagement.model.DTO;

import com.alura.powermanagement.model.Address;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PersonDTO {

    @NotBlank(message = "Nome é um campo obrigatório e não pode estar em branco")
    private String name;

    @NotBlank(message = "Aniversario é um campo obrigatório e não pode estar em branco")
    private String birthDate;

    @NotBlank(message = "Genero é um campo obrigatório e não pode estar em branco")
    private String gender;

    @NotBlank(message = "Parentesco é um campo obrigatório e não pode estar em branco")
    private String kinship;

    private Address address;

}
