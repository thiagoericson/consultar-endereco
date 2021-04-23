package br.com.treinamento.consultarendereco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinamento.consultarendereco.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
