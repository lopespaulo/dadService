package com.ufrn.dad.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class Docente {

	@Id
	@Column(name = "id_docente")
	@JsonProperty("id_docente")
	public Integer id;
	
	public String nome;
	
	public String formacao;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_unidade", referencedColumnName = "id_unidade")
	@JsonProperty("unidade")
	public Unidade unidade;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date data_admissao;

	public Docente() {
		super();
		
	}
	
	
	public Docente(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public Date getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}
	
	
	
	

}
