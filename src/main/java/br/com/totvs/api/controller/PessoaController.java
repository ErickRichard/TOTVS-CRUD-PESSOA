package br.com.totvs.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.totvs.api.model.Pessoa;
import br.com.totvs.api.service.PessoaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/person")
@Api(value = "Serviço Cadastro")
public class PessoaController {

	@Autowired
	private PessoaService service;

	@GetMapping("/procurarPessoa/{personId}")
	@ApiOperation(value = "Procurar Pessoa Cadastrada")
	public Pessoa getPerson(@PathVariable Long personId) {
		return service.getPerson(personId);
	}

	@GetMapping("/procurarPessoas/")
	@ApiOperation(value = "Procurar todas as Pessoas")
	public List<Pessoa> allPersons() {
		return service.getPersons().size() <= 0 ? null : service.getPersons();
	}

	@DeleteMapping("/deletarPessoa/{personId}")
	@ApiOperation(value = "Remover Pessoa designada")
	public List<Pessoa> deletePerson(@PathVariable Long personId) {
		return service.removePerson(personId);
	}

	@PostMapping("/salvar")
	@ApiOperation(value = "Salvar Nova Pessoa")
	public String savePerson(@RequestBody Pessoa person) {
		return verificarCPF(person.getCpf()) ? "O CPF não pode ser menor do que 11 caracteres."
				: service.savePerson(person);
	}

	private boolean verificarCPF(String numeroCPF) {
		if (numeroCPF.length() < 11) {
			System.out.println("O CPF não pode ser menor do que 11 caracteres.");
			return true;
		}
		return false;
	}

}
