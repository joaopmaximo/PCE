package br.unisantos.pce.model;

import java.io.Serial;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AnamneseAdulto {

	public enum Tipo_Atendimento {
		avaliação,
		orientação
	}
	
    @Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

    @Column(name = "nome", length = 30, nullable = false)
	private String nome;

	@Column(name = "tipo_atendimento", nullable = false)
	@Enumerated(EnumType.STRING)
	private Tipo_Atendimento tipo_Atendimento;

}
