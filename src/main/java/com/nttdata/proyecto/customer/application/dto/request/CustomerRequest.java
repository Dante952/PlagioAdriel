package com.nttdata.proyecto.customer.application.dto.request;

import com.nttdata.proyecto.customer.application.dto.validation.DocumentTypeValidation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DocumentTypeValidation
public class CustomerRequest {

    @NotBlank(message = "Debe ingresar un nombre")
    private String nombre;

    @NotBlank(message = "debe ingresar un apellido")
    private String apellido;

    private String tipoDocumento;

    private String documento;

}
