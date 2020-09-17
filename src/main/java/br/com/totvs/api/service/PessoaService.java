package br.com.totvs.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.totvs.api.dao.PessoaRepository;
import br.com.totvs.api.model.Pessoa;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;

	public String savePerson(Pessoa person) {
		repository.save(person);
		return "A pessoa " + person.getNamePerson().toUpperCase() + " foi salva com sucesso, seu código de registro é: " + person.getIdPessoa();
	}

	public Pessoa getPerson(Long personId) {
		return repository.findById(personId).orElse(null);
	}

	public List<Pessoa> getPersons() {
		return repository.findAll();
	}
	
	public List<Pessoa> removePerson(Long personId) {
		repository.deleteById(personId);
		return repository.findAll();
	}
}
