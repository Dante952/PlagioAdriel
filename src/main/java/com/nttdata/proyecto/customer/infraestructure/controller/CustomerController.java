package com.nttdata.proyecto.customer.infraestructure.controller;

import com.nttdata.proyecto.customer.application.dto.request.CustomerRequest;
import com.nttdata.proyecto.customer.application.dto.response.CustomerResponse;
import com.nttdata.proyecto.customer.domain.dto.entity.CustomerEntity;
import com.nttdata.proyecto.customer.domain.dto.entity.DocumentTypeEntity;
import com.nttdata.proyecto.customer.infraestructure.dao.repository.CustomerRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value ="/customer")
public class CustomerController {

    @Autowired
    private CustomerRepositoryJPA customerRepositoryJPA;

    @PostMapping(value = "/save")
    public ResponseEntity<CustomerResponse> saveCustomer(@Valid @RequestBody CustomerRequest customerRequest){
        CustomerEntity customerEntity = customerRepositoryJPA.save(CustomerEntity.builder()
                .document(customerRequest.getDocumento())
                .documentType(DocumentTypeEntity.builder().id(Long.parseLong(customerRequest.getTipoDocumento())).build())
                .firstName(customerRequest.getNombre())
                .lastName(customerRequest.getApellido())
                .build());
        return ResponseEntity.status(HttpStatus.CREATED).body(
                CustomerResponse.builder()
                        .code("200")
                        .message("Successfully created client: " + customerEntity.getLastName())
                        .build()
        );
    }

}
