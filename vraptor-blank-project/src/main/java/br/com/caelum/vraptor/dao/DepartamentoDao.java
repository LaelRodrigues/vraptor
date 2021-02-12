package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Departamento;

public class DepartamentoDao {
	
	@Inject
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Departamento> listarDepartamentos(){
        return em.createQuery("select d from Departamento d").getResultList();
	}
}
