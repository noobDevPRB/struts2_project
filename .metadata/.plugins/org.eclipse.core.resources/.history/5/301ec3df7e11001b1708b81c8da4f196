<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Soc Teste</title>
</head>
<body>

	<%@ include file="navBar.jsp"%>
	
	<div class="container">
		<div class="row justify-content-center py-5">
			<h4>Lista de Pacientes</h4>
		</div>
		
	  	<div class="row justify-content-center custon-table">	  		
		    <table class="table">
			  <thead class="thead-dark">
			    <tr>
			      <th>Id</th>
			      <th>Paciente</th>
			      <th>idade</th>
			      <th>Genêro</th>
			      <th></th>
			    </tr>
			  </thead>
			  <c:forEach items="${listaPacientesForm}" var="paciente">
				  <tbody>
				    <tr>
				      <th><a href="visualizarPaciente?paciente.id=${paciente.id}"><c:out value="${paciente.id}"/></a></th>
				      <td><c:out value="${paciente.nm_cmplt}"/></td>
				      <td><c:out value="${paciente.idade}"/></td>
				      <td><c:out value="${paciente.genero}"/></td>
				      <td><a href="navegarAtualizarPaciente?paciente.id=${paciente.id}">Atualizar</a></td>
				    </tr>
				  </tbody>
			  </c:forEach>
			</table>		
	  	</div>
	</div>	
</body>
</html>