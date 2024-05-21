package com.nttdata.proyecto.customer.infraestructure.repository.impl;

import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;
import com.nttdata.proyecto.customer.domain.repository.CustomerRepository;
import com.nttdata.proyecto.customer.infraestructure.dao.repository.CustomerRepositoryJPA;
import com.nttdata.proyecto.customer.infraestructure.mapper.CustomerEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerRepositoryImpl implements CustomerRepository {


    private final CustomerRepositoryJPA customerRepositoryJPA;

    @Override
    public List<CustomerModel> listCustomers() {
        return CustomerEntityMapper.INSTANCE.mapToCustomerModel(customerRepositoryJPA.findAll());
    }

    @Override
    public CustomerModel saveCustomer(CustomerModel customerModel) {
        return CustomerEntityMapper.INSTANCE.mapToCustomerModel(
                customerRepositoryJPA.save(CustomerEntityMapper.INSTANCE.mapToCustomerEntity(customerModel))
        );
    }

    @Override
    public CustomerModel updateCustomer(CustomerModel customerModel) {
        return CustomerEntityMapper.INSTANCE.mapToCustomerModel(
                customerRepositoryJPA.save(CustomerEntityMapper.INSTANCE.mapToCustomerEntity(customerModel))
        );
    }


}
