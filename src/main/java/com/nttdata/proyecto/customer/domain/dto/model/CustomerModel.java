package com.nttdata.proyecto.customer.domain.dto.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {

    private long id;

    private String documentType;

    private String  document;

    private String  firstName;

    private String  lastName;

    private LocalDate dateCreated;
}
