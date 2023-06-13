package com.alura.powermanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
public class User {

    @Id
    private Integer id;

    @Getter
    @Setter
    @NotBlank(message = "Nome é um campo obrigatório e não pode estar em branco")
    private String name;

    @Past
    @Getter
    @Setter
    @NotBlank(message = "Data de aniversário é um campo obrigatório e não pode estar em branco")
    private String birthDate;

    @Getter
    @Setter
    @NotBlank(message = "Genero é um campo obrigatório e não pode estar em branco")
    private String gender;

    @Getter
    @Setter
    @NotBlank(message = "Parentesco é um campo obrigatório e não pode estar em branco")
    private String relationship;
}
