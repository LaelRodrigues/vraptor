package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.EmpregadoDao;
import br.com.caelum.vraptor.model.Empregado;

@Controller
public class EmpregadoController{

	@Inject
	private EmpregadoDao empregadoDao;
	
	private Result result;
	
	protected EmpregadoController() {
		this(null);
	}
	
	@Inject
	public EmpregadoController(Result result) {
		this.result = result;
	}
	
	
	@Path("/")
	public void inicio() {
	}
	
	@Post
	public void add(Empregado empregado) {
		empregadoDao.adicionar(empregado);
		result.redirectTo(this).inicio();
	}	
	
}
