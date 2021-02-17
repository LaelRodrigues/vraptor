<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VRaptor Blank Project</title>
</head>
<body>
	<h1> Gerenciamento de Empregados</h1>
	<a href="${linkTo[EmpregadoController].form()}"><button> Cadastar Empregados </button></a>
	<br><br>
	<a href="${linkTo[EmpregadoController].lista()}"><button> Listar Empregados </button></a>
</body>
</html>