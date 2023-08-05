package com.coursespring.service;

import com.coursespring.model.Customer;

public interface CustomerService {

	Customer save(Customer customer);
	Customer findById(Long id);
	Customer findByCpf(String cpf);
}
