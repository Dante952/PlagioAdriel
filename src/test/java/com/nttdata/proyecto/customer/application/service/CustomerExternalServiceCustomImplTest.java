package com.nttdata.proyecto.customer.application.service;

import com.nttdata.proyecto.customer.application.service.impl.CustomerExternalServiceCustomImpl;
import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;
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
class CustomerExternalServiceCustomImplTest {

    @InjectMocks
    private CustomerExternalServiceCustomImpl customerExternalServiceCustom;

    @Mock
    private CustomerExternalService customerExternalService;

    @BeforeEach
    void setUp(){
        customerExternalServiceCustom = new CustomerExternalServiceCustomImpl(customerExternalService);
    }

    @Test
    void saveCustomerModelTest(){
        when(customerExternalService.saveCustomerModel(any())).thenReturn(createCustomerModel());
        CustomerModel test =customerExternalServiceCustom.saveCustomerModel(createCustomerModel());
        assertEquals("Dante", test.getFirstName());
        assertEquals("Torres", test.getLastName());
        assertEquals("123456789", test.getDocument());
    }

    @Test
    void listCustomerModelTest(){
        when(customerExternalService.listCustomerModel()).thenReturn(createCustomerModelList());
        List<CustomerModel> test =customerExternalServiceCustom.listCustomerModel();
        assertEquals("Dante", test.get(0).getFirstName());
        assertEquals("Torres", test.get(0).getLastName());
        assertEquals("123456789", test.get(0).getDocument());

    }

    @Test
    void updateCustomerModelTest(){
        when(customerExternalService.updateCustomerModel(any())).thenReturn(createCustomerModel());
        CustomerModel test =customerExternalServiceCustom.updateCustomerModel(createCustomerModel());
        assertEquals("Dante", test.getFirstName());
        assertEquals("Torres", test.getLastName());
        assertEquals("123456789", test.getDocument());
    }



}
