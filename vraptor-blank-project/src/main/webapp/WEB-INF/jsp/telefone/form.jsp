<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Telefone</title>
</head>
<body>
	<h2> Cadastro do Telefone</h2>
		<form action="${linkTo[TelefoneController].add}" method="post">
			DDD:
	       	<input type="text" name="telefone.ddd" value="${telefone.ddd}"/>
	        Número:
	        <input type="text" name="telefone.numero" value="${telefone.numero}"/>
	        <h3> Empregado </h3>
	        Selecione o Empregado:
	        <select name="telefone.empregado.id">
	      		<c:forEach items="${empregados}" var="empregado">
	       			<option value="${empregado.id}">${empregado.nomeEmpregado} - ${empregado.matricula}</option>
	       		</c:forEach>		
	        </select> 
	        <br><br>
	        <button type="submit">Adicionar</button>
		</form>
</body>
</html>