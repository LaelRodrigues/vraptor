package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Empregado;

public class EmpregadoDao {
    
    @Inject
	private EntityManager em;
	
	public void adicionar(Empregado empregado) {
		em.persist(empregado);
	}
	
	@SuppressWarnings("unchecked") 
	public List<Empregado> listarEmpregados(){
		return em.createQuery("select e from Empregado e").getResultList();
		
	}
 }
