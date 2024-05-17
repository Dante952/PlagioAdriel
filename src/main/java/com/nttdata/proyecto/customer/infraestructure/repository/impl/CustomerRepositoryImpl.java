package com.nttdata.proyecto.customer.infraestructure.repository.impl;

import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;
import com.nttdata.proyecto.customer.domain.repository.CustomerRepository;
import com.nttdata.proyecto.customer.infraestructure.dao.repository.CustomerRepositoryJPA;
import com.nttdata.proyecto.customer.infraestructure.mapper.CustomerEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerRepositoryImpl implements CustomerRepository {


    private final CustomerRepositoryJPA customerRepositoryJPA;

    @Override
    public List<CustomerModel> listCustomers() {
        //return customerRepositoryJPA.findAll().stream().map(CustomerEntityMapper.INSTANCE::mapToCustomerModel).collect(Collectors.toList());
        return CustomerEntityMapper.INSTANCE.mapToCustomerModel(customerRepositoryJPA.findAll());
    }
}
