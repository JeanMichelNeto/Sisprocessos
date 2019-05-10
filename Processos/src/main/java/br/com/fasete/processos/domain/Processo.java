package br.com.fasete.processos.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Processo extends GenericDomain {
	@Column(nullable = false)
	private Long numero;
	
	@Temporal(TemporalType.DATE)
	private Date dtCadastro;
	
	@Temporal(TemporalType.DATE)
	private Date dtFinal;
	
	@Column(length = 30, nullable = false)
	private String situacao;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Contribuinte contribuinte;

	public Processo(){}
	
	public Processo(Long numero, Date dtCadastro, Date dtFinal, String situacao, Tipo tipo, Contribuinte contribuinte) {
		super();
		this.numero = numero;
		this.dtCadastro = dtCadastro;
		this.dtFinal = dtFinal;
		this.situacao = situacao;
		this.tipo = tipo;
		this.contribuinte = contribuinte;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Date getDtFinal() {
		return dtFinal;
	}

	public void setDtFinal(Date dtFinal) {
		this.dtFinal = dtFinal;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Contribuinte getContribuinte() {
		return contribuinte;
	}

	public void setContribuinte(Contribuinte contribuinte) {
		this.contribuinte = contribuinte;
	}

}
