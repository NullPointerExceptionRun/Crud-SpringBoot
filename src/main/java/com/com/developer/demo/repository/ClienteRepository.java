package com.com.developer.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com.developer.demo.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
}
