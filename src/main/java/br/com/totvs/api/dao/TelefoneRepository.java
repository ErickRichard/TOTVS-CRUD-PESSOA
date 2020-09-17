package br.com.totvs.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.totvs.api.model.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long>{

}
