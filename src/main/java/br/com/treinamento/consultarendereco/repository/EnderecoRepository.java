package br.com.treinamento.consultarendereco.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinamento.consultarendereco.model.Cliente;
import br.com.treinamento.consultarendereco.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

	Optional<Endereco> findByIdAndCliente(Integer id, Cliente cliente);

}
