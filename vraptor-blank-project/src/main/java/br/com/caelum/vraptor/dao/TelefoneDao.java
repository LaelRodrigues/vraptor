package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Telefone;

public class TelefoneDao {
	
	@Inject
	private EntityManager em;
	
	public void adicionar(Telefone telefone) {
		em.persist(telefone);
	}
	
	@SuppressWarnings("unchecked")
	public List<Telefone> listarTelefones(){
        return em.createQuery("select t from Telefone t").getResultList();

	}
}
