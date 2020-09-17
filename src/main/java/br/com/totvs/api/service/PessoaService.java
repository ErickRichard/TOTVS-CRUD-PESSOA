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

	@Autowired
	private TelefoneService telefoneService;

	@Autowired
	private EnderecoService enderecoService;

	public String savePerson(Pessoa person) {
		repository.save(person);
		enderecoService.saveEndereco(person.getIdEndereco());
		telefoneService.saveTelefone(person.getIdTelefone());
		return "A pessoa " + person.getNomePessoa().toUpperCase() + " foi salva com sucesso, seu código de registro é: "
				+ person.getIdPessoa();
	}

	public Pessoa getPerson(Long personId) {
		return repository.findById(personId).orElse(null);
	}

	public List<Pessoa> getPersons() {
		enderecoService.getEnderecos();
		telefoneService.getTelefones();
		return repository.findAll();
	}

	public List<Pessoa> removePerson(Long personId) {
		Pessoa p = getPerson(personId);
		enderecoService.removeEndereco(p.getIdEndereco().getIdEndereco());
		telefoneService.removeTelefone(p.getIdTelefone().getIdTelefone());
		repository.deleteById(personId);
		return repository.findAll();
	}
}
