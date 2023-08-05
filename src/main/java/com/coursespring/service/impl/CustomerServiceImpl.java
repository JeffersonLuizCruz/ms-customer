package com.coursespring.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.coursespring.model.Customer;
import com.coursespring.repository.CustomerRepository;
import com.coursespring.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository customerRepository;
	
	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer findById(Long id) {
		return customerRepository.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found"));
	}
	
	@Override
	public Customer findByCpf(String cpf) {
		return customerRepository.findByCpf(cpf)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found"));
	}

}
