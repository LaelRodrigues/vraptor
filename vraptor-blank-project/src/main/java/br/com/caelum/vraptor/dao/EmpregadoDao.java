package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.vraptor.model.Empregado;

@Stateless
public class EmpregadoDao {
    
    @PersistenceContext
	private EntityManager em;
	
	public void adicionar(Empregado empregado) {
		em.persist(empregado);
	}
	
	@SuppressWarnings("unchecked")
	public List<Empregado> listarEmpregados(){
        return em.createQuery("select e from Empregado e").getResultList();

	}
}
