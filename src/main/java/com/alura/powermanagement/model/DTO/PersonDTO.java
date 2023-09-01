package com.alura.powermanagement.model.DTO;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PersonDTO {

    @NotBlank(message = "Nome é um campo obrigatório e não pode estar em branco")
    private String name;

    @NotBlank(message = "Aniversario é um campo obrigatório e não pode estar em branco")
//    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
    private String birthDate;

    @NotBlank(message = "Genero é um campo obrigatório e não pode estar em branco")
    private String gender;

    @NotBlank(message = "Parentesco é um campo obrigatório e não pode estar em branco")
    private String kinship;

    @NotNull(message = "Id do endereço é um campo obrigatório e não pode estar em branco")
    private int addressId;

    @NotNull(message = "Id do usuário é um campo obrigatório e não pode estar em branco")
    private int userId;

}
