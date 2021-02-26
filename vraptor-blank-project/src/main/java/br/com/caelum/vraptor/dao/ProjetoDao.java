package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Projeto;

public class ProjetoDao {
	
	@Inject
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Projeto> listarProjetos(){
        return em.createQuery("select p FROM Projeto p").getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Projeto> listarProjetosEmpregado() {
		return em.createQuery("select e FROM Empregado e JOIN e.projetos p").getResultList();
	}
}