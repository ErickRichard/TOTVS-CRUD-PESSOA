package br.com.totvs.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.totvs.api.dao.TelefoneRepository;
import br.com.totvs.api.model.Telefone;

@Service
public class TelefoneService {

	@Autowired
	private TelefoneRepository repository;

	public Telefone getTelefone(Long telefoneId) {
		return repository.findById(telefoneId).orElse(null);
	}

	public List<Telefone> getTelefones() {
		return repository.findAll();
	}

	public void saveTelefone(Telefone tel) {
		repository.save(tel);
	}

	public void removeTelefone(Long telefoneId) {
		repository.deleteById(telefoneId);
	}
}
