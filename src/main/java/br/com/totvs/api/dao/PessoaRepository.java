package br.com.totvs.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.totvs.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
