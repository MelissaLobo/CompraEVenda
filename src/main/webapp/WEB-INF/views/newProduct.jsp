
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:ui="http://java.sun.com/jsf/facelets">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<link href="template.html" rel="stylesheet">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina de Cadastro de Produto</title>
</head>

<body>
	<jsp:include page="template.jsp" />

	<div class="container">

		<h1>Novo Produto:</h1>

		<form:form class="form-signin" id="product" action="/createProduct"
			method="POST" commandName="createProduct">
			<h2 class="form-signin-heading" enctype="multipart/form-data">Novo
				Produto</h2>

			<div>
				<label>Nome do Produto:</label> <input type="text"
					class="form-control" name="productName">
				<form:errors path="productName" />
			</div>
			<div>
				<label>Imagem:</label> <input type="file" class="form-control"
					name="images">
				<form:errors path="images" />
			</div>
			<div>
				<label>Preço:</label>
				<div class="input-group">
					<span class="input-group-addon">R$</span> <input type="text"
						class="form-control" name="price">
					<form:errors path="price" />
				</div>
			</div>
			<div>
				<div class="form-group" >
					<label for="sel1">Categoria:</label> <select class="form-control" id="sel1">
					<option>OUTROS</option>
					<option>MODA</option>
					<option>CASA</option>
					<option>ESPORTE</option>
					<option>ELETRO</option>
					<option>BELEZA</option>
					<option>ANTIGUIDADES</option>	
				<form:errors path="category" /></select>
			</div></div>
			
				<div>
				<label>Descrição:</label> <input type="text" class="form-control"
					name="description">
				<form:errors path="description" />
			</div>
			<div id="actions" class="row">
				<div class="col-md-12">
					<button type="submit" class="btn btn-primary"
						value="Create Product">Salvar</button>
					<a href="/" class="btn btn-default">Cancelar</a>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>