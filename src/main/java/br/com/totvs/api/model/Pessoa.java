package br.com.totvs.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

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
	@ApiModelProperty(value = "Nome da pessoa")
	private String namePerson;
	@ApiModelProperty(value = "Idade da pessoa")
	private Integer idade;
	@ApiModelProperty(value = "RG da pessoa")
	private String rg;
	@ApiModelProperty(value = "CPF da pessoa")
	private String cpf;
	@ApiModelProperty(value = "Endereço da pessoa")
	private String endereco;

}
