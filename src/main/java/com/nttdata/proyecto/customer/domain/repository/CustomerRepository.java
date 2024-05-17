package com.nttdata.proyecto.customer.domain.repository;

import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;

import java.util.List;

public interface CustomerRepository {
    public List<CustomerModel> listCustomers();
}
