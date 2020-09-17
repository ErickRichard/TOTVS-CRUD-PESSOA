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
public class Telefone implements Serializable {

	private static final long serialVersionUID = -2798351035145717302L;

	@Id
	@GeneratedValue
	@ApiModelProperty(value = "Idenficador autogerado")
	private Long idTelefone;

	@ApiModelProperty(value = "Codigo País")
	private int codigoPaisTelefone;

	@ApiModelProperty(value = "DDD")
	private int dddTelefone;

	@ApiModelProperty(value = "Número")
	private String numeroTelefone;

	@ApiModelProperty(value = "Tipo Contato")
	private String tipoContatoTelefone;

}
