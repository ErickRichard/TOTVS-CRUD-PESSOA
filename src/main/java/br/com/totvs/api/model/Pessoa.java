package br.com.totvs.api.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@ApiModelProperty(value = "Idenficador autogerado")
	private Long idPessoa;
	@ApiModelProperty(value = "Nome")
	private String nomePessoa;

	@ApiModelProperty(value = "apelido")
	private String apelido;

	@ApiModelProperty(value = "RG")
	private String rg;

	@ApiModelProperty(value = "CPF")
	private String cpf;

	@ApiModelProperty(value = "data nascimento")
	private Date dataNascimento;

	@ApiModelProperty(value = "Profissão")
	private String profissao;

	@ApiModelProperty(value = "CPF")
	private Double salario;

	@ApiModelProperty(value = "Nome Dependente")
	private String nomeDependente;

	@ApiModelProperty(value = "Tipo Dependente")
	private String tipoDependente;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idEndereco", referencedColumnName = "idEndereco")
	private Endereco idEndereco;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idTelefone", referencedColumnName = "idTelefone")
	private Telefone idTelefone;

}
