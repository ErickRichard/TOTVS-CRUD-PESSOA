package br.com.totvs.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.totvs.api.dao.EnderecoRepository;
import br.com.totvs.api.model.Endereco;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;
	
	public Endereco getEndereco(Long enderecoId) {
		return repository.findById(enderecoId).orElse(null);
	}

	public List<Endereco> getEnderecos() {
		return repository.findAll();
	}
	
	public void saveEndereco(Endereco end) {
		repository.save(end);
	}

	public void removeEndereco(Long enderecoId) {
		repository.deleteById(enderecoId);
	}

}
