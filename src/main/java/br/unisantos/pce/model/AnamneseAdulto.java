package br.unisantos.pce.model;

import java.io.Serial;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AnamneseAdulto {

	private enum TipoAtendimento {
		avaliacao,
		orientacao;
	}

	private enum Sexo {
		masculino,
		feminino,
		nao_informado;
	}

	private enum Escolaridade {
		fundamental_completo,
		ensino_medio_completo,
		ensino_superior_incompleto,
		ensino_superior_completo,
		outra;
	}

	private enum Periodo {
		manha,
		tarde,
		noite,
		NA;
	}

	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nome", length = 60, nullable = false)
	private String nome;

	@Column(name = "tipo_atendimento", nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoAtendimento tipo_Atendimento;

	@Column(name = "data_nascimento", nullable = false)
	private LocalDate data_nascimento;

    @Column(name = "idade", columnDefinition = "TINYINT UNSIGNED")
    private Integer idade;

	@Column(name = "sexo", nullable = false)
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	@Column(name = "cidade", nullable = false)
	private String cidade;
	
	@Column(name = "bairro", nullable = false)
	private String bairro;
	
	@Column(name = "escolaridade", nullable = false)
	@Enumerated(EnumType.STRING)
	private Escolaridade escolaridade;

	@Column(name = "periodo_estudo", nullable = false)
	@Enumerated(EnumType.STRING)
	private Periodo periodo_estudo;

	@Column(name = "lanche_estudo", nullable = false)
    private Boolean lanche_estudo;
	
	@Column(name = "periodo_trabalho", nullable = false)
	@Enumerated(EnumType.STRING)
	private Periodo periodo_trabalho;
	
	@Column(name = "lanche_trabalho", nullable = false)
    private Boolean lanche_trabalho;

	@Column(name = "profissao", length = 60, nullable = false)
	private String profissao;

	@Column(name = "data_atendimento", nullable = false, updatable = false)
	private LocalDate data_atendimento;

	@PrePersist
	protected void onCreate() {
		data_atendimento = LocalDate.now();
		idade = LocalDate.now().getYear() - data_nascimento.getYear();

		if (data_nascimento.getMonthValue() > LocalDate.now().getMonthValue() ||
				(data_nascimento.getMonthValue() == LocalDate.now().getMonthValue() &&
						data_nascimento.getDayOfMonth() > LocalDate.now().getDayOfMonth())) {
			idade--;
		}
	}

}
