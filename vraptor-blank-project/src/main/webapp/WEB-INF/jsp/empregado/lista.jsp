<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="stylesheet" type="text/css" href="../bootstrap/css/bootstrap.css"> -->
<meta charset="ISO-8859-1">
<title>Listagem</title>
</head>
	<h1> Listagem dos empregados</h1>
		<c:forEach items="${empregados}" var="empregado">
			<h3>Dados Gerais</h3>        
            Matricula: ${empregado.matricula}<br>
            Nome: ${empregado.nomeEmpregado}<br>
            Salario: ${empregado.salario}<br>
            <h3>Telefone</h3>
            DDD: ${empregado.telefone.ddd}<br>
            Número: ${empregado.telefone.numero}<br>
            <h3>Endereço</h3>
            Cidade: ${empregado.endereco.cidade}<br>
            Estado: ${empregado.endereco.estado}<br>
            <h3>Departamento</h3>
            Departamento: ${empregado.departamento.nomeDepartamento}<br>    
            <%-- <h3>Projetos</h3>
            <c:forEach items="${projetos}" var="projeto">
            	${empregado.projetos.nomeProjeto}
            </c:forEach> --%>
     	</c:forEach>
	<%-- <table class="table table-stripped table-hover table-bordered">
		<thead>
			<tr>
				<th>Matricula</th>
				<th>Nome</th>
				<th>Salario</th>
				<th>Telefone-DDD</th>
				<th>Telefone-Número</th>
				<th>Endereco-Cidade</th>
				<th>Endereco-Estado</th>
				<th>Departamento</th>
			</tr>
	    </thead>
	    <tbody>
            <c:forEach items="${empregados}" var="empregado">
                <tr>
                    <td>${empregado.matricula}</td>
                    <td>${empregado.nomeEmpregado}</td>
                    <td>${empregado.salario}</td>
                    <td>${empregado.telefone.ddd}</td>
                    <td>${empregado.telefone.numero}</td>
                    <td>${empregado.endereco.cidade}</td>
                    <td>${empregado.endereco.estado}</td>
                    <td>${empregado.departamento.nomeDepartamento}</td>
                    
                </tr>
            </c:forEach>
	    </tbody>
	</table> --%>
	<br><a href="${linkTo[EmpregadoController].inicio()}"><button> Voltar </button></a>
	
<body>

</body>
</html>