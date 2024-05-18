package com.nttdata.proyecto.customer.application.mapper;

import com.nttdata.proyecto.customer.application.dto.request.CustomerRequest;
import com.nttdata.proyecto.customer.application.dto.request.CustomerUpdateRequest;
import com.nttdata.proyecto.customer.domain.dto.entity.CustomerEntity;
import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;
import java.util.Date;

@Mapper
public interface CustomerModelMapper {
    CustomerModelMapper INSTANCE = Mappers.getMapper(CustomerModelMapper.class);


    default CustomerModel mapToCustomerModel(CustomerRequest customerRequest){
        return CustomerModel.builder()
                .documentType(customerRequest.getTipoDocumento())
                .document(customerRequest.getDocumento())
                .firstName(customerRequest.getNombre())
                .lastName(customerRequest.getApellido())
                .dateCreated(LocalDate.now())
                .build();
    }

    default CustomerModel mapToCustomerUpdateModel(CustomerUpdateRequest customerRequest){
        return CustomerModel.builder()
                .id(Long.parseLong(customerRequest.getId()))
                .documentType(customerRequest.getTipoDocumento())
                .document(customerRequest.getDocumento())
                .firstName(customerRequest.getNombre())
                .lastName(customerRequest.getApellido())
                .dateCreated(LocalDate.now())
                .build();
    }
}
