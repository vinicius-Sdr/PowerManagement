package com.alura.powermanagement.model.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplianceDTO {

    @NotBlank(message = "Aniversario é um campo obrigatório e não pode estar em branco")
    private String name;

    @NotBlank(message = "Aniversario é um campo obrigatório e não pode estar em branco")
    private String model;

    @NotNull(message = "Aniversario é um campo obrigatório e não pode estar em branco")
    private Double potency;
}
