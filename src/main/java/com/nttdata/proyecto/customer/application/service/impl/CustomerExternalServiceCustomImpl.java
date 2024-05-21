package com.nttdata.proyecto.customer.application.service.impl;

import com.nttdata.proyecto.customer.application.service.CustomerExternalService;
import com.nttdata.proyecto.customer.application.service.CustomerExternalServiceCustom;
import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerExternalServiceCustomImpl implements CustomerExternalServiceCustom {

    private final CustomerExternalService customerExternalService;

    @Override
    public List<CustomerModel> listCustomerModel() {
        return customerExternalService.listCustomerModel();
    }

    @Override
    public CustomerModel saveCustomerModel(CustomerModel customerModels) {
        return customerExternalService.saveCustomerModel(customerModels);
    }

    @Override
    public CustomerModel updateCustomerModel(CustomerModel customerModels) {
        return customerExternalService.updateCustomerModel(customerModels);
    }
}
