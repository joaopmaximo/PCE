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

	@Column(name = "num_pessoas_domicilio", columnDefinition = "TINYINT UNSIGNED", nullable = false)
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

	@Column(name = "carnes_bovina")
	private String carnesBovina;

	@Column(name = "carnes_suina")
	private String carnesSuina;

	@Column(name = "carnes_aves")
	private String carnesAves;

	@Column(name = "carnes_peixe")
	private String carnesPeixe;

	@Column(name = "frutos_do_mar")
	private String frutosDoMar;

	@Column(name = "ovo")
	private String ovo;

	@Column(name = "arroz_branco_polido")
	private String arrozBrancoPolido;

	@Column(name = "arroz_integral")
	private String arrozIntegral;

	@Column(name = "lacteos_leite_integral_desnatado_semi")
	private String lacteosLeiteIntegralDesnatadoSemi;

	@Column(name = "lacteos_leite_sem_lactose")
	private String lacteosLeiteSemLactose;

	@Column(name = "lacteos_queijos")
	private String lacteosQueijosPedacoOuFatia;

	@Column(name = "lacteos_iogurtes")
	private String lacteosIogurtes;

	@Column(name = "cereais_aveia")
	private String cereaisAveia;

	@Column(name = "cereais_granola_in_natura")
	private String cereaisGranolaInNatura;

	@Column(name = "cereais_quinoa")
	private String cereaisQuinoa;

	@Column(name = "cereais_linhaca")
	private String cereaisLinhaca;

	@Column(name = "cereais_chia")
	private String cereaisChia;

	@Column(name = "paes_frances_media_normal")
	private String paesFrancesMediaNormal;

	@Column(name = "paes_frances_media_integral")
	private String paesFrancesMediaIntegral;

	@Column(name = "paes_forma")
	private String paesForma;

	@Column(name = "paes_forma_integral")
	private String paesFormaIntegral;

	@Column(name = "paes_cara")
	private String paesCara;

	@Column(name = "pastas_requeijao")
	private String pastasRequeijao;

	@Column(name = "pastas_margarina")
	private String pastasMargarina;

	@Column(name = "pastas_manteiga")
	private String pastasManteiga;

	@Column(name = "pastas_ricota")
	private String pastasRicota;

	@Column(name = "pastas_cottage")
	private String pastasCottage;

	@Column(name = "pastas_doce_de_leite")
	private String pastasDoceDeLeite;

	@Column(name = "pastas_creme_de_avela")
	private String pastasCremeDeAvela;

	@Column(name = "pastas_geleia")
	private String pastasGeleia;

	@Column(name = "salgados_mistinho_esfiha")
	private String salgadosMistinhoEsfiha;

	@Column(name = "salgados_coxinha_croquete")
	private String salgadosCoxinhaCroquete;

	@Column(name = "salgados_empadas")
	private String salgadosEmpadas;

	@Column(name = "salgados_pao_de_queijo")
	private String salgadosPaoDeQueijo;

	@Column(name = "ultraprocessados_salgadinho_de_pacote")
	private String ultraprocessadosSalgadinhoDePacote;

	@Column(name = "ultraprocessados_biscoito_salgado")
	private String ultraprocessadosBiscoitoSalgado;

	@Column(name = "ultraprocessados_biscoito_doce")
	private String ultraprocessadosBiscoitoDoce;

	@Column(name = "ultraprocessados_chocolate")
	private String ultraprocessadosChocolate;

	@Column(name = "ultraprocessados_refrigerante")
	private String ultraprocessadosRefrigerante;

	@Column(name = "ultraprocessados_suco_em_po_caixinha")
	private String ultraprocessadosSucoEmPoCaixinha;

	@Column(name = "ultraprocessados_pratos_prontos_congelados")
	private String ultraprocessadosPratosProntosCongelados;

	@Column(name = "ultraprocessados_macarrao_instantaneo")
	private String ultraprocessadosMacarraoInstantaneo;

	@Column(name = "ultraprocessados_bolinho")
	private String ultraprocessadosBolinho;

	@Column(name = "ultraprocessados_fast_food")
	private String ultraprocessadosFastFood;

	@Column(name = "embutidos_salame")
	private String embutidosSalame;

	@Column(name = "embutidos_presunto")
	private String embutidosPresunto;

	@Column(name = "embutidos_apresuntado_mortadela")
	private String embutidosApresuntadoMortadela;

	@Column(name = "embutidos_linguica_toscana_calabresa")
	private String embutidosLinguicaToscanaCalabresa;

	@Column(name = "embutidos_salsicha")
	private String embutidosSalsicha;

	@Column(name = "embutidos_peito_de_peru")
	private String embutidosPeitoDePeru;

	@Column(name = "embutidos_rosbife")
	private String embutidosRosbife;

	@Column(name = "embutidos_nuggets")
	private String embutidosNuggets;

	@Column(name = "embutidos_hamburguer_tradicional")
	private String embutidosHamburguerTradicional;

	@Column(name = "acucares_acucar")
	private String acucaresAcucar;

	@Column(name = "acucares_adocante")
	private String acucaresAdocante;

	@Column(name = "acucares_mel_melado")
	private String acucaresMelMelado;

	@Column(name = "acucares_produtos_confeitaria")
	private String acucaresProdutosConfeitaria;

	@Column(name = "acucares_guloseimas")
	private String acucaresGuloseimas;

	@Column(name = "acucares_achocolatados")
	private String acucaresAchocolatados;

	@Column(name = "molhos_ketchup")
	private String molhosKetchup;

	@Column(name = "molhos_mostarda")
	private String molhosMostarda;

	@Column(name = "molhos_shoyu")
	private String molhosShoyu;

	@Column(name = "molhos_tare")
	private String molhosTare;

	@Column(name = "molhos_maionese")
	private String molhosMaionese;

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
