package com.fmgarcia.draco.service;

import org.springframework.stereotype.Service;

import com.fmgarcia.draco.core.domain.Customer;
import com.fmgarcia.draco.core.dtos.CustomerRequestDTO;
import com.fmgarcia.draco.core.dtos.CustomerResponseDTO;
import com.fmgarcia.draco.core.exceptions.NoSuchElementFoundException;
import com.fmgarcia.draco.core.mappers.CustomerMapper;
import com.fmgarcia.draco.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

	private final CustomerMapper mapper;

	private final CustomerRepository customerRepository;

	@Override
	public CustomerResponseDTO save(CustomerRequestDTO requestDTO) {
		Customer customer = mapper.toCustomer(requestDTO);

		Customer newCustomer = customerRepository.save(customer);

		CustomerResponseDTO responseDTO = mapper.toCustomerDTO(newCustomer);
		log.info("save ->" + responseDTO.toString());

		return responseDTO;
	}

	@Override
	public Iterable<CustomerResponseDTO> findAll() {
		Iterable<Customer> customers = customerRepository.findAll();

		Iterable<CustomerResponseDTO> responseDTOs = mapper.toCustomerDTOs(customers);

		return responseDTOs;
	}

	@Override
	public CustomerResponseDTO findById(Long id) {
		Customer customer = customerRepository.findById(id)
				.orElseThrow(() -> new NoSuchElementFoundException(String.format("Item with id %d not found", id)));

		return mapper.toCustomerDTO(customer);
	}

}
