package com.coursespring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.coursespring.model.Customer;
import com.coursespring.repository.CustomerRepository;
import com.coursespring.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired private CustomerRepository customerRepository;
	
	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Transactional
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
