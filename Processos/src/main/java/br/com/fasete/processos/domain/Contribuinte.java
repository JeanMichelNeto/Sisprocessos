package br.com.fasete.processos.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Contribuinte extends GenericDomain {
	@Column(length = 80, nullable = false)
	private String nome;
	
	@Column(length = 20, nullable = false)
	private String cpf;
	
	@Temporal(TemporalType.DATE)
	private Date dtCadastro;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Usuario usuario;
	
	public Contribuinte(){}

	public Contribuinte(String nome, String cpf, Date dtCadastro, Usuario usuario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dtCadastro = dtCadastro;
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}

