package br.com.treinamento.consultarendereco.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinamento.consultarendereco.model.Cliente;
import br.com.treinamento.consultarendereco.model.Endereco;
import br.com.treinamento.consultarendereco.service.ClienteService;
import br.com.treinamento.consultarendereco.service.EnderecoService;

@RestController
@RequestMapping("/clientes/{idCliente}/enderecos/{id}")
public class EnderecoController {

	@Autowired
	ClienteService clienteService;
	
	@Autowired
	EnderecoService enderecoService;
	
	// PUT
	@GetMapping("")
	public ResponseEntity<?> get(@PathVariable Integer idCliente, @PathVariable Integer id) {
		try {
			Cliente cliente = clienteService.getCliente(idCliente);
			Endereco enderecoAtual = enderecoService.getEndereco(id, cliente);
			return new ResponseEntity<Endereco>(enderecoAtual, HttpStatus.OK); // 200
		} catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404	
		}
	}
	
}