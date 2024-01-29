package br.unisantos.pce.controller;

import java.util.List;
import java.util.Optional;

import jakarta.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unisantos.pce.model.AnamneseAdulto;
import br.unisantos.pce.service.AnamneseAdultoService;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/anamneseadulto", produces = MediaType.APPLICATION_JSON_VALUE)
public class AnamneseAdultoController {

	private final AnamneseAdultoService anamneseAdultoService;

	public AnamneseAdultoController(AnamneseAdultoService AnamneseAdultoService) {
		this.anamneseAdultoService = AnamneseAdultoService;
	}
	
	@GetMapping
	public ResponseEntity<List<AnamneseAdulto>> listarAnamneseAdultos() {
		return ResponseEntity.status(200).body(anamneseAdultoService.listarAnamneseAdultos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<AnamneseAdulto>> consultarAnamneseAdulto (@PathVariable Integer id) {
		Optional<AnamneseAdulto> AnamneseAdultoOptional = anamneseAdultoService.consultarAnamneseAdulto(id);

		if (AnamneseAdultoOptional.isPresent()) {
			return ResponseEntity.status(200).body(anamneseAdultoService.consultarAnamneseAdulto(id));
		}

		return ResponseEntity.status(404).build();
	}
	
	@PostMapping
	public ResponseEntity<AnamneseAdulto> criarAnamneseAdulto (@Valid @RequestBody AnamneseAdulto novoAnamneseAdulto) {
		return ResponseEntity.status(201).body(anamneseAdultoService.criarAnamneseAdulto(novoAnamneseAdulto));
	}

	@PutMapping
	public ResponseEntity<AnamneseAdulto> alterarAnamneseAdulto (@Valid @RequestBody AnamneseAdulto novoAnamneseAdulto) {
		return ResponseEntity.status(201).body(anamneseAdultoService.criarAnamneseAdulto(novoAnamneseAdulto));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletarAnamneseAdulto (@PathVariable Integer id) {
		Optional<AnamneseAdulto> AnamneseAdultoOptional = anamneseAdultoService.consultarAnamneseAdulto(id);

		if (AnamneseAdultoOptional.isPresent()) {
			anamneseAdultoService.deletarAnamneseAdulto(id);
			return ResponseEntity.status(204).build();
		}

		return ResponseEntity.status(404).build();
	}
}
