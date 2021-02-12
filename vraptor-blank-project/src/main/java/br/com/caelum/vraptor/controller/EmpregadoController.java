package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.DepartamentoDao;
import br.com.caelum.vraptor.dao.EmpregadoDao;
import br.com.caelum.vraptor.dao.ProjetoDao;
import br.com.caelum.vraptor.model.Empregado;

@Controller
public class EmpregadoController{

	@Inject 
	private EmpregadoDao empregadoDao;
	
	@Inject
	private DepartamentoDao departamentoDao;
	
	@Inject 
	private ProjetoDao projetoDao;
	
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
		result.include("departamentos", departamentoDao.listarDepartamentos());
		result.include("projetos", projetoDao.listarProjetos());
		 
	}
	
	@Post
	public void add(Empregado empregado) {
		System.out.println(empregado.getDepartamento().getId());
		empregadoDao.adicionar(empregado);
		System.out.println("ESTOU AQUI");
		result.redirectTo(this).inicio();
	}	
	
}
