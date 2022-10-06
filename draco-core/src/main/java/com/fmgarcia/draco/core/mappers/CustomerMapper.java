package com.fmgarcia.draco.core.mappers;

import org.mapstruct.Mapper;

import com.fmgarcia.draco.core.domain.Customer;
import com.fmgarcia.draco.core.dtos.CustomerRequestDTO;
import com.fmgarcia.draco.core.dtos.CustomerResponseDTO;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
	Customer toCustomer(CustomerRequestDTO requestDTO);

	CustomerResponseDTO toCustomerDTO(Customer customer);

	Iterable<CustomerResponseDTO> toCustomerDTOs(Iterable<Customer> customer);
}
