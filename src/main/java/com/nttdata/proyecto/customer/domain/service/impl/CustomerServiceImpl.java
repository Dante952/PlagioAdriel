package com.nttdata.proyecto.customer.domain.service.impl;

import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;
import com.nttdata.proyecto.customer.domain.repository.CustomerRepository;
import com.nttdata.proyecto.customer.domain.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<CustomerModel> listCustomerModel() {
        return customerRepository.listCustomers();
    }

    @Override
    public CustomerModel saveCustomerModel(CustomerModel customerModels) {
        return customerRepository.saveCustomer(customerModels);
    }
}
