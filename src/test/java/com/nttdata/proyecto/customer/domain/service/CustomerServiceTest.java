package com.nttdata.proyecto.customer.domain.service;

import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;
import com.nttdata.proyecto.customer.domain.repository.CustomerRepository;
import com.nttdata.proyecto.customer.domain.service.impl.CustomerServiceImpl;
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
class CustomerServiceTest {

    @InjectMocks
    private CustomerServiceImpl customerService;

    @Mock
    private CustomerRepository customerRepository;

    @BeforeEach
    void setUp(){
        customerService = new CustomerServiceImpl(customerRepository);
    }

    @Test
    void saveCustomerModelTest(){
        when(customerRepository.saveCustomer(any())).thenReturn(createCustomerModel());
        CustomerModel test =customerService.saveCustomerModel(createCustomerModel());
        assertEquals("Dante", test.getFirstName());
        assertEquals("Torres", test.getLastName());
        assertEquals("123456789", test.getDocument());
    }

    @Test
    void listCustomerModelTest(){
        when(customerRepository.listCustomers()).thenReturn(createCustomerModelList());
        List<CustomerModel> test =customerService.listCustomerModel();
        assertEquals("Dante", test.get(0).getFirstName());
        assertEquals("Torres", test.get(0).getLastName());
        assertEquals("123456789", test.get(0).getDocument());

    }

    @Test
    void updateCustomerModelTest(){
        when(customerRepository.updateCustomer(any())).thenReturn(createCustomerModel());
        CustomerModel test =customerService.updateCustomerModel(createCustomerModel());
        assertEquals("Dante", test.getFirstName());
        assertEquals("Torres", test.getLastName());
        assertEquals("123456789", test.getDocument());
    }

}
