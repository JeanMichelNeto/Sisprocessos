package br.com.fasete.processos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Tipo extends GenericDomain {
	@Column(length = 50, nullable = false)
	private String descricao;
	
	public Tipo(){}

	public Tipo(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
