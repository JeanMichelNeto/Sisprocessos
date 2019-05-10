package br.com.fasete.processos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Funcionario extends GenericDomain {
	@Column(length = 80, nullable = false)
	private String nome;
	
	@Column(length = 20, nullable = false)
	private String cpf;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Setor setor;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Usuario usuario;
	
	public Funcionario(){}

	public Funcionario(String nome, String cpf, Setor setor, Usuario usuario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.setor = setor;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

}
