package br.com.caelum.vraptor.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projeto implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int codigoProjeto;
	
	private String nomeProjeto;
	
	@ManyToMany(mappedBy="projetos")
	private Set<Empregado> empregado;
	
	public Projeto() {}

	public Projeto(int id, int codigoProjeto, String nomeProjeto, Set<Empregado> empregado) {
		super();
		this.id = id;
		this.codigoProjeto = codigoProjeto;
		this.nomeProjeto = nomeProjeto;
		this.empregado = empregado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigoProjeto() {
		return codigoProjeto;
	}

	public void setCodigoProjeto(int codigoProjeto) {
		this.codigoProjeto = codigoProjeto;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public Set<Empregado> getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Set<Empregado> empregado) {
		this.empregado = empregado;
	}
}
