package br.unisantos.pce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unisantos.pce.model.AnamneseAdulto;

public interface CrudRepository extends JpaRepository<AnamneseAdulto, Integer>{
}
