package com.coursespring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Customer implements Serializable{
	private static final long serialVersionUID = -3580918759002650665L;
	
	@EqualsAndHashCode.Include
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cpf;
	private Integer age;

}
