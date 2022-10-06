package com.fmgarcia.draco.service;

import com.fmgarcia.draco.core.dtos.CustomerRequestDTO;
import com.fmgarcia.draco.core.dtos.CustomerResponseDTO;

public interface CustomerService {

	CustomerResponseDTO save(CustomerRequestDTO requestDTO);

	Iterable<CustomerResponseDTO> findAll();

	CustomerResponseDTO findById(Long id);

}
