package com.com.developer.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.com.developer.demo.entity.Cliente;
import com.com.developer.demo.repository.ClienteRepository;

@Service // anotação para definir como um service
public class ClienteService {

	private ClienteRepository clienteRepository;
	
	public Cliente salvar(Cliente cliente) {
		
		return clienteRepository.save(cliente);
	}

	
	public List<Cliente> listaCliente(){
		return clienteRepository.findAll();
	}
	
	public Optional<Cliente> buscarPorId(Long Id){
		return clienteRepository.findById(Id);
	}
	
	public void removerPorId(Long id) {
		clienteRepository.deleteById(id);
	}
	
}
