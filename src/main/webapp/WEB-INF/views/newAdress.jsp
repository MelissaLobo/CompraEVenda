<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="template.jsp"/>

	<form id="teste" class="form-signin" action="/createAdress" method="POST">
		<h1>Novo Endereço</h1>
		Nome do Endereço: <input type="text" class="form-control" name="nameAdress"> 
		<br>
		Rua: <input type="text" class="form-control" name="street"> 
        <br>
		Numero: <input type="number" class="form-control" name="number">
		<br>
		Complemento: <input type="text" class="form-control" name="complement"> 
        <br>
		CEP: <input type="number" class="form-control" name="zipCode">
		<br>
		Cidade: <input type="text" class="form-control" name="city">
		<br>
		Estado: <input type="text" class="form-control" name="State">
		<br>
		Confirmar Senha: 
		<br>
		<input name="submit" type="submit" value="Criar Endereço"
					class="btn btn-lg btn-primary btn-block" />
	</form>
</body>
</html>