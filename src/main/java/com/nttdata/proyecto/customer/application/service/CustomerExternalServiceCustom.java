package com.nttdata.proyecto.customer.application.service;

import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;

import java.util.List;

public interface CustomerExternalServiceCustom {
    List<CustomerModel> listCustomerModel();

    CustomerModel saveCustomerModel(CustomerModel customerModels);
}
