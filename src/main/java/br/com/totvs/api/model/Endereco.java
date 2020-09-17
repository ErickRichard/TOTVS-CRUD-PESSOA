package br.com.totvs.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
public class Endereco implements Serializable {
	
	private static final long serialVersionUID = -9165942515846549371L;

	@Id
	@GeneratedValue
	@ApiModelProperty(value = "Idenficador autogerado")
	private Long idEndereco;
	
	@ApiModelProperty(value = "cnpj ")
	private String cnpj;

	@ApiModelProperty(value = "Tipo Endereço")
	private String tipoEndereco;

	@ApiModelProperty(value = "Tipo")
	private String logadouro;

	@ApiModelProperty(value = "Endereço")
	private String nomeEndereco;

	@ApiModelProperty(value = "Numero Residencia")
	private int numeroResidencia;

	@ApiModelProperty(value = "Complemento")
	private String complementoEndereco;

	@ApiModelProperty(value = "Cep")
	private String cep;

	@ApiModelProperty(value = "Bairro")
	private String bairro;

	@ApiModelProperty(value = "Cidade")
	private String cidade;

	@ApiModelProperty(value = "Estado ")
	private String estado;

	@ApiModelProperty(value = "País")
	private String pais;
}
