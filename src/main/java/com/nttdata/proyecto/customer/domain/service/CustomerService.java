package com.nttdata.proyecto.customer.domain.service;

import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;

import java.util.List;

public interface CustomerService {

    List<CustomerModel> listCustomerModel();

    CustomerModel saveCustomerModel(CustomerModel customerModels);
}
