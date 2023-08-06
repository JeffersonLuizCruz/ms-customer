package com.coursespring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coursespring.model.Customer;
import com.coursespring.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController @Slf4j
@RequestMapping("/customers")
public class CustomerController {

	@Autowired private CustomerService customerService;
	
	@PostMapping
	public ResponseEntity<Customer> save(@RequestBody Customer customer){
		return ResponseEntity.status(HttpStatus.CREATED).body(customerService.save(customer));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> findById(@PathVariable Long id){
		return ResponseEntity.ok(customerService.findById(id));
	}
	
	@GetMapping
	public ResponseEntity<Customer> findByCpf(@RequestParam(name = "cpf") String cpf){
		return ResponseEntity.ok(customerService.findByCpf(cpf));
	}
	
	@GetMapping("/find")
	public String find() {
		log.info("Obtendo status da instância do serviço cliente");
		return "Hello World";
	}
}
