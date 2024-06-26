package com.nttdata.proyecto.customer.infraestructure.controller;

import com.nttdata.proyecto.customer.application.dto.request.CustomerRequest;
import com.nttdata.proyecto.customer.application.dto.request.CustomerUpdateRequest;
import com.nttdata.proyecto.customer.application.dto.response.CustomerResponse;
import com.nttdata.proyecto.customer.application.mapper.CustomerModelMapper;
import com.nttdata.proyecto.customer.application.service.CustomerExternalServiceCustom;
import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value ="/customer")
public class CustomerController {

    private final CustomerExternalServiceCustom customerExternalServiceCustom;

    @PostMapping(value = "/save")
    public ResponseEntity<CustomerResponse> saveCustomer(@Valid @RequestBody CustomerRequest customerRequest){
        customerExternalServiceCustom.saveCustomerModel(CustomerModelMapper.INSTANCE.mapToCustomerModel(customerRequest));
        return ResponseEntity.status(HttpStatus.CREATED).body(
                CustomerResponse.builder()
                        .code("200")
                        .message("Successfully created client: " )
                        .build()
        );
    }

    @PutMapping(value = "/update")
    public ResponseEntity<CustomerResponse> updateCustomer(@Valid @RequestBody CustomerUpdateRequest customerRequest){
        customerExternalServiceCustom.saveCustomerModel(CustomerModelMapper.INSTANCE.mapToCustomerUpdateModel(customerRequest));
        return ResponseEntity.status(HttpStatus.CREATED).body(
                CustomerResponse.builder()
                        .code("200")
                        .message("Successfully created client: " )
                        .build()
        );
    }


    @GetMapping("/customerList")
    public ResponseEntity<List<CustomerModel>> toListCustomer(){
                return ResponseEntity.status(HttpStatus.CREATED).body(
                customerExternalServiceCustom.listCustomerModel()
        );
    }

}
