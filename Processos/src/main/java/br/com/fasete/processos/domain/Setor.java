package br.com.fasete.processos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Setor extends GenericDomain{
	@Column(length = 80, nullable = false)
	private String descricao;

	public Setor(){}
	
	public Setor(String descricao) {
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
