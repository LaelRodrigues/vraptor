package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.EmpregadoDao;
import br.com.caelum.vraptor.dao.TelefoneDao;
import br.com.caelum.vraptor.model.Telefone;

@Controller
public class TelefoneController {
	
	@Inject
	private TelefoneDao telefoneDao;
	
	@Inject
	private EmpregadoDao empregadoDao;
	
	private Result result;
	
	protected TelefoneController() {
		this(null);
	}
	
	@Inject
	public TelefoneController(Result result) {
		this.result = result;
	}
	
	public void form() {
		result.include("empregados", empregadoDao.listarEmpregados());
	}
	
	@Post
	public void add(Telefone telefone) {
		telefoneDao.adicionar(telefone);
		result.redirectTo(this).form();
	}
	
}