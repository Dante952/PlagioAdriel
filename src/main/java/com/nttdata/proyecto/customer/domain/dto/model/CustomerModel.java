package com.nttdata.proyecto.customer.domain.dto.model;

import com.nttdata.proyecto.customer.domain.dto.entity.DocumentTypeEntity;
import lombok.*;

import java.util.Date;

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

    private Date dateCreated;
}
