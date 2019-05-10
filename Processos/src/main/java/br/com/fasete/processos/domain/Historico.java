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
public class Historico extends GenericDomain {
	@Temporal(TemporalType.DATE)
	private Date dtEncaminhamento;
	
	@Temporal(TemporalType.DATE)
	private Date dtFinal;
	
	@Column(length = 30, nullable = false)
	private String situacao;
	
	private String observacao;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Processo processo;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Setor setor;

	public Historico(Date dtEncaminhamento, Date dtFinal, String situacao, String observacao, Processo processo,
			Setor setor) {
		super();
		this.dtEncaminhamento = dtEncaminhamento;
		this.dtFinal = dtFinal;
		this.situacao = situacao;
		this.observacao = observacao;
		this.processo = processo;
		this.setor = setor;
	}

	public Date getDtEncaminhamento() {
		return dtEncaminhamento;
	}

	public void setDtEncaminhamento(Date dtEncaminhamento) {
		this.dtEncaminhamento = dtEncaminhamento;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	

}
