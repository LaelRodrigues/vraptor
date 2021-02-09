package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.vraptor.model.Departamento;

@Stateless
public class DepartamentoDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Departamento> listarDepartamentos(){
        return em.createQuery("select d from Departamento d").getResultList();

	}
}
