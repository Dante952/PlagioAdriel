package com.nttdata.proyecto.customer.application.service.impl;

import com.nttdata.proyecto.customer.application.service.CustomerExternalService;
import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;
import com.nttdata.proyecto.customer.domain.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@Service
public class CustomerExternalServiceImpl implements CustomerExternalService {

    private final CustomerService customerService;

    @Override
    public List<CustomerModel> listCustomerModel() {
        return customerService.listCustomerModel();
    }

    @Override
    public CustomerModel saveCustomerModel(CustomerModel customerModels) {
        return customerService.saveCustomerModel(customerModels);
    }

    @Override
    public CustomerModel updateCustomerModel(CustomerModel customerModels) {
        return customerService.updateCustomerModel(customerModels);
    }
}
