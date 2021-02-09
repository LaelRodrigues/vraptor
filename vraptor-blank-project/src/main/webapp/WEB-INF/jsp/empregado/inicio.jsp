<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VRaptor Blank Project</title>
</head>
<body>
	<h2> Cadastro de Empregado</h2>
		<form action="${linkTo[EmpregadoController].add}" method="post">
		   Matrícula:
		   <input type="text" name="empregado.matricula" value="${empregado.matricula}"/>
		   Nome:
		   <input type="text" name="empregado.nomeEmpregado" value="${empregado.nomeEmpregado}"/>
		   Salario:
		   <input type="text" name="empregado.salario" value="${empregado.salario}"/>
		   <h3> Telefone</h3>
           DDD:
           <input type="text" name="empregado.telefone.ddd" value="${empregado.telefone.ddd}"/>
           Número:
           <input type="text" name="empregado.telefone.numero" value="${empregado.telefone.numero}"/>
           <h3> Endereço</h3>
           Estado:
           <input type="text" name="empregado.endereco.estado" value="${empregado.endereco.estado}"/>
           Cidade:
           <input type="text" name="empregado.endereco.cidade" value="${empregado.endereco.cstado}"/>
           <br><br>           
           <button>Adicionar</button>
       </form>
</body>
</html>