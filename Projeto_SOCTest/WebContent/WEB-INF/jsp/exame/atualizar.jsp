<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

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

	<div class="container custon-transley">
		<div class="row justify-content-center pb-5">
			<h4>Atualizar Exame</h4>
		</div>
		
	  	<div class="row justify-content-center">
		    <div class="col-lg-6 align-item">
		    <h4 class="pt-3">Exame c�digo ${exame.id}</h4>
				<form action="atualizarExame"method="post">

					<div class="form-group">
						<label>Nome do Exame</label>
						<input class="form-control" value="${exame.nm_exame}" type="text" required="required" maxlength="40" placeholder="Nome do exame" name="exame.nm_exame"> 
					</div>

					 <div class="form-group">
						<label>C�digo do Paciente</label>
						<input class="form-control" value="${exame.id_pcnt}" type="number" required="required" placeholder="C�digo do paciente" name="exame.id_pcnt">
					</div>
					<div class="form-group">
						<label>Data do Exame</label>
						<input type="date" value="${exame.exm_data}" required="required" placeholder="Data" name="exame.exm_data">
					</div>
								
					<div class="form-group">
						<label>Relat�rio do Exame</label>
						<textarea class="form-control" rows="3" placeholder="Digite o resultado do exame aqui." name="exame.resultado">${exame.resultado}</textarea>
					</div>

					<div class="pt-3 row justify-content-center">
						<input value="${exame.id}" type="hidden" name="exame.id">
						<button type="submit" class="btn btn-primary px-5" value="Cadastrar">Atualizar</button>
					</div>
				</form>
		    </div>
	  	</div>
	</div>
</body>
</html>