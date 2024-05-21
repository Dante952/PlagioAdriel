package com.nttdata.proyecto.customer.util;

import com.nttdata.proyecto.customer.domain.dto.entity.CustomerEntity;
import com.nttdata.proyecto.customer.domain.dto.entity.DocumentTypeEntity;
import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;

import java.time.LocalDate;
import java.util.List;

public class util {

    public static CustomerModel createCustomerModel(){
        return CustomerModel.builder()
                .id(1)
                .document("123456789")
                .firstName("Dante")
                .lastName("Torres")
                .documentType("1")
                .dateCreated(LocalDate.now())
                .build();
    }

    public static List<CustomerModel> createCustomerModelList(){
        return List.of(CustomerModel.builder()
                .id(1)
                .document("123456789")
                .firstName("Dante")
                .lastName("Torres")
                .documentType("1")
                .dateCreated(LocalDate.now())
                .build());
    }

    public static List<CustomerEntity> createCustomerEntityList(){
        return List.of(CustomerEntity.builder()
                .id(1)
                .document("123456789")
                .firstName("Dante")
                .lastName("Torres")
                .documentType(DocumentTypeEntity.builder().id(1).documentName("Dni").build())
                .dateCreated(LocalDate.now())
                .build());
    }

    public static CustomerEntity createCustomerEntity(){
        return CustomerEntity.builder()
                .id(1)
                .document("123456789")
                .firstName("Dante")
                .lastName("Torres")
                .documentType(DocumentTypeEntity.builder().id(1).documentName("Dni").build())
                .dateCreated(LocalDate.now())
                .build();
    }
}
