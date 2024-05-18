package com.nttdata.proyecto.customer.infraestructure.mapper;

import com.nttdata.proyecto.customer.domain.dto.entity.CustomerEntity;
import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface CustomerEntityMapper {

    CustomerEntityMapper INSTANCE = Mappers.getMapper(CustomerEntityMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "documentType", source = "documentType.documentName")
    @Mapping(target = "document", source = "document")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "dateCreated", source = "dateCreated")
    CustomerModel mapToCustomerModel(CustomerEntity customerEntity);

    List<CustomerModel> mapToCustomerModel(List<CustomerEntity> customerEntities);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "documentType.id", source = "documentType")
    @Mapping(target = "document", source = "document")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "dateCreated", source = "dateCreated")
    CustomerEntity mapToCustomerEntity(CustomerModel customerModel);

}
