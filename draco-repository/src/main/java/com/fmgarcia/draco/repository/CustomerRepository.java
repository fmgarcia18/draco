package com.fmgarcia.draco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmgarcia.draco.core.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
