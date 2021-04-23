package br.com.treinamento.consultarendereco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treinamento.consultarendereco.model.Cliente;
import br.com.treinamento.consultarendereco.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente getCliente(Integer id) {
		return clienteRepository.findById(id).get();
	}
	
}
