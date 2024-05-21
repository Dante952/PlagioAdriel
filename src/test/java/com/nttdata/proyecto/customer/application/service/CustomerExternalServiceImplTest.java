package com.nttdata.proyecto.customer.application.service;

import com.nttdata.proyecto.customer.application.service.impl.CustomerExternalServiceImpl;
import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;
import com.nttdata.proyecto.customer.domain.service.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.nttdata.proyecto.customer.util.util.createCustomerModel;
import static com.nttdata.proyecto.customer.util.util.createCustomerModelList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CustomerExternalServiceImplTest {

    @InjectMocks
    private CustomerExternalServiceImpl customerExternalService;

    @Mock
    private CustomerService customerService;

    @BeforeEach
    void setUp(){
        customerExternalService = new CustomerExternalServiceImpl(customerService);
    }

    @Test
    void saveCustomerModelTest(){
        when(customerService.saveCustomerModel(any())).thenReturn(createCustomerModel());
        CustomerModel test =customerExternalService.saveCustomerModel(createCustomerModel());
        assertEquals("Dante", test.getFirstName());
        assertEquals("Torres", test.getLastName());
        assertEquals("123456789", test.getDocument());
    }

    @Test
    void listCustomerModelTest(){
        when(customerService.listCustomerModel()).thenReturn(createCustomerModelList());
        List<CustomerModel> test =customerExternalService.listCustomerModel();
        assertEquals("Dante", test.get(0).getFirstName());
        assertEquals("Torres", test.get(0).getLastName());
        assertEquals("123456789", test.get(0).getDocument());

    }

    @Test
    void updateCustomerModelTest(){
        when(customerService.updateCustomerModel(any())).thenReturn(createCustomerModel());
        CustomerModel test =customerExternalService.updateCustomerModel(createCustomerModel());
        assertEquals("Dante", test.getFirstName());
        assertEquals("Torres", test.getLastName());
        assertEquals("123456789", test.getDocument());
    }


}
