package com.nttdata.proyecto.customer.infraestructure.dao.repository;

import com.nttdata.proyecto.customer.domain.dto.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositoryJPA extends JpaRepository<CustomerEntity, String> {

}
