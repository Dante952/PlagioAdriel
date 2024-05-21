package com.nttdata.proyecto.customer.infraestructure.repository;

import com.nttdata.proyecto.customer.domain.dto.model.CustomerModel;
import com.nttdata.proyecto.customer.infraestructure.dao.repository.CustomerRepositoryJPA;
import com.nttdata.proyecto.customer.infraestructure.repository.impl.CustomerRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.nttdata.proyecto.customer.util.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CustomerRepositoryTest {
    @InjectMocks
    private CustomerRepositoryImpl customerRepository;

    @Mock
    private CustomerRepositoryJPA customerRepositoryJPA;

    @BeforeEach
    void setUp(){
        customerRepository = new CustomerRepositoryImpl(customerRepositoryJPA);
    }

    @Test
    void saveCustomerModelTest(){
        when(customerRepositoryJPA.save(any())).thenReturn(createCustomerEntity());
        CustomerModel test =customerRepository.saveCustomer(createCustomerModel());
        assertEquals("Dante", test.getFirstName());
        assertEquals("Torres", test.getLastName());
        assertEquals("123456789", test.getDocument());
    }

    @Test
    void listCustomerModelTest(){
        when(customerRepositoryJPA.findAll()).thenReturn(createCustomerEntityList());
        List<CustomerModel> test =customerRepository.listCustomers();
        assertEquals("Dante", test.get(0).getFirstName());
        assertEquals("Torres", test.get(0).getLastName());
        assertEquals("123456789", test.get(0).getDocument());

    }

    @Test
    void updateCustomerModelTest(){
        when(customerRepositoryJPA.save(any())).thenReturn(createCustomerEntity());
        CustomerModel test =customerRepository.updateCustomer(createCustomerModel());
        assertEquals("Dante", test.getFirstName());
        assertEquals("Torres", test.getLastName());
        assertEquals("123456789", test.getDocument());
    }
}
