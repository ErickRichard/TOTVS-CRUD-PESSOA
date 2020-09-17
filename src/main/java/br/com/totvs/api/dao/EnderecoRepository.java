package br.com.totvs.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.totvs.api.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
