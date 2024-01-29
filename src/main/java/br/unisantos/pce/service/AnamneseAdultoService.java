package br.unisantos.pce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.unisantos.pce.model.AnamneseAdulto;
import br.unisantos.pce.repository.CrudRepository;

@Service
public class AnamneseAdultoService {

	private final CrudRepository repository;

	public AnamneseAdultoService (CrudRepository repository) {
		this.repository = repository;
	}
	
	public List<AnamneseAdulto> listarAnamneseAdultos() {
		return (List<AnamneseAdulto>) repository.findAll();
	}
	
	public Optional<AnamneseAdulto> consultarAnamneseAdulto (Integer id) {
		return repository.findById(id);
	}
	
	public AnamneseAdulto criarAnamneseAdulto (AnamneseAdulto AnamneseAdulto) {
		repository.save(AnamneseAdulto);
		return AnamneseAdulto;
	}
	
	public AnamneseAdulto alterarAnamneseAdulto (AnamneseAdulto AnamneseAdulto) {
		repository.save(AnamneseAdulto);
		return AnamneseAdulto;
	}

	public Boolean deletarAnamneseAdulto (Integer id) {
		repository.deleteById(id);
		return true;
	}
}
