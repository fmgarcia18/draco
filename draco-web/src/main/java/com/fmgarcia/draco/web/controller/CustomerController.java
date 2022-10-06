package com.fmgarcia.draco.web.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fmgarcia.draco.core.dtos.CustomerRequestDTO;
import com.fmgarcia.draco.core.dtos.CustomerResponseDTO;
import com.fmgarcia.draco.service.CustomerService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/customers")
public class CustomerController {

	private final CustomerService customerService;

	@GetMapping
	public ResponseEntity<Iterable<CustomerResponseDTO>> getCustomers() {

		Iterable<CustomerResponseDTO> customers = customerService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(customers);
	}

	@PostMapping
	public ResponseEntity<CustomerResponseDTO> saveCustomer(@Valid @RequestBody CustomerRequestDTO request) {

		log.info(request.toString());

		CustomerResponseDTO customer = customerService.save(request);

		log.info(customer.toString());

		return ResponseEntity.status(HttpStatus.OK).body(customer);
	}
}
