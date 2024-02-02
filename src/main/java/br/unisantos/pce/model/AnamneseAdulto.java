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
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
	private TipoAtendimento tipoAtendimento;

	@Column(name = "data_nascimento", nullable = false)
	private LocalDate dataNascimento;

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
	private Periodo periodoEstudo;

	@Column(name = "lanche_estudo", nullable = false)
    private Boolean lancheEstudo;
	
	@Column(name = "periodo_trabalho", nullable = false)
	@Enumerated(EnumType.STRING)
	private Periodo periodoTrabalho;
	
	@Column(name = "lanche_trabalho", nullable = false)
    private Boolean lancheTrabalho;

	@Column(name = "profissao", length = 60, nullable = false)
	private String profissao;

	@Min(0)
	@Max(4)
	@Column(name = "renda_familiar", columnDefinition = "TINYINT UNSIGNED", nullable = false)
    private Integer rendaFamiliar;

	@Column(name = "num_pessoas_domicilio", columnDefinition = "TINYINT UNSIGNED" ,nullable = false)
    private Integer numPessoasDomicilio;
	
	@Column(name = "motivo", nullable = false)
	private String motivo;

	@Column(name = "apresenta_doenca")
	private String apresentaDoenca;

	@Column(name = "antecedentes_familiares")
	private String antecedentesFamiliares;

	@Column(name = "medicamentos_continuos")
	private String medicamentosContinuos;

	@Column(name = "suplementos_complementos")
	private String suplementosComplimentos;

	@Column(name = "frequencia_evacuacao", nullable = false)
	private String frequenciaEvacuacao;

	@Column(name = "consistencia_evacuacao", columnDefinition = "TINYINT UNSIGNED", nullable = false)
	private Integer consistenciaEvacuacao;

	@Column(name = "pratica_atv_fisica", nullable = false)
	private Boolean praticaAtvFisica;

	@Column(name = "atv_fisica", nullable = false)
	private String atvFisica;

	@Column(name = "frequencia_semanal_atv_fisica", nullable = false)
	private Integer frequenciaSemanalAtvFisica;

	@Column(name = "duracao_atv_fisica", nullable = false)
	private String duracaoAtvFisica;

	@Column(name = "cafe_da_manha")
	private String cafeDaManha;

	@Column(name = "lanche_da_manha")
	private String lancheDaManha;

    @Column(name = "almoco")
    private String almoco;

    @Column(name = "lanche_da_tarde")
    private String lancheDaTarde;

    @Column(name = "jantar")
    private String jantar;

    @Column(name = "ceia")
    private String ceia;

	@Column(name = "legumes_cenoura")
	private String legumesCenoura;

	@Column(name = "legumes_beterraba")
    private String legumesBeterraba;

    @Column(name = "legumes_berinjela")
    private String legumesBerinjela;

    @Column(name = "legumes_pepino")
    private String legumesPepino;

    @Column(name = "legumes_abobrinha")
    private String legumesAbobrinha;

    @Column(name = "legumes_chuchu")
    private String legumesChuchu;

    @Column(name = "legumes_tomate")
    private String legumesTomate;

	@Column(name = "verduras_acelga")
    private String verdurasAcelga;

    @Column(name = "verduras_agriao")
    private String verdurasAgriao;

    @Column(name = "verduras_alface")
    private String verdurasAlface;

    @Column(name = "verduras_brocolis")
    private String verdurasBrocolis;

    @Column(name = "verduras_chicoria")
    private String verdurasChicoria;

    @Column(name = "verduras_couve_manteiga")
    private String verdurasCouveManteiga;

    @Column(name = "verduras_couve_flor")
    private String verdurasCouveFlor;

    @Column(name = "verduras_espinafre")
    private String verdurasEspinafre;

    @Column(name = "verduras_rucula")
    private String verdurasRucula;

	@Column(name = "frutas_c_laranja")
    private String frutasCLaranja;

    @Column(name = "frutas_c_tangerina")
    private String frutasCTangerina;

    @Column(name = "frutas_c_limao")
    private String frutasCLimao;

    @Column(name = "frutas_c_abacaxi")
    private String frutasCAbacaxi;

    @Column(name = "frutas_c_acerola")
    private String frutasCAcerola;

    @Column(name = "frutas_c_morango")
    private String frutasCMorango;

    @Column(name = "frutas_c_kiwi")
    private String frutasCKiwi;

    @Column(name = "frutas_c_maracuja")
    private String frutasCMaracuja;

	@Column(name = "demais_frutas_banana")
    private String demaisFrutasBanana;

    @Column(name = "demais_frutas_goiaba")
    private String demaisFrutasGoiaba;

    @Column(name = "demais_frutas_maca")
    private String demaisFrutasMaca;

    @Column(name = "demais_frutas_mamao")
    private String demaisFrutasMamao;

    @Column(name = "demais_frutas_manga")
    private String demaisFrutasManga;

    @Column(name = "demais_frutas_melancia")
    private String demaisFrutasMelancia;

    @Column(name = "demais_frutas_melao")
    private String demaisFrutasMelao;

    @Column(name = "demais_frutas_pera")
    private String demaisFrutasPera;

    @Column(name = "demais_frutas_pessego")
    private String demaisFrutasPessego;

    @Column(name = "demais_frutas_uva")
    private String demaisFrutasUva;

	@Column(name = "leguminosas_feijao")
    private String leguminosasFeijao;

    @Column(name = "leguminosas_lentilha")
    private String leguminosasLentilha;

    @Column(name = "leguminosas_ervilha")
    private String leguminosasErvilha;

    @Column(name = "leguminosas_soja")
    private String leguminosasSoja;

    @Column(name = "leguminosas_grao_de_bico")
    private String leguminosasGraoDeBico;

    @Column(name = "leguminosas_vagem")
    private String leguminosasVagem;

	@Column(name = "data_atendimento", nullable = false)
	private LocalDate dataAtendimento;

	@PrePersist
	protected void onCreate() {
		dataAtendimento = LocalDate.now();
		idade = LocalDate.now().getYear() - dataNascimento.getYear();

		if (dataNascimento.getMonthValue() > LocalDate.now().getMonthValue() ||
				(dataNascimento.getMonthValue() == LocalDate.now().getMonthValue() &&
						dataNascimento.getDayOfMonth() > LocalDate.now().getDayOfMonth())) {
			idade--;
		}
	}

}
