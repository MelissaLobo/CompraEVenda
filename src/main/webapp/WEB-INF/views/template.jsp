<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<!--InformaÃ§Ãµes da Pagina -->
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Bootstrap Login Form</title>
<meta name="generator" content="Bootply" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

</head>
<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span><span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/">Compra e Venda </a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/">Início</a></li>
					<li><a href="#">Categorias</a></li>
					<li><a href="#">Produtos</a></li>
					<li><a href="#">Sua Loja</a></li>
					<li><a href="#">Contato</a></li>
					<%-- <li><a href="<c:url value="/logout" />">Logout</a></li> --%>
				</ul>
					<ul class="nav navbar-nav navbar-right">
       				 <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sua Conta</a></li>
       				 <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Carrinho</a></li>
     				
					</ul>
			</div>
		</div>
	</nav>
<div class="container text-center">    
  <h3>Compraevenda.com</h3><br>
	<div></div></div>
		<br>
		<br>
		<br>
<footer class="container-fluid text-center">
  <p>Compraevenda.com Copyright 2016</p>  
  <form class="form-inline">Receber ofertas:
    <input type="email" class="form-control" size="50" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Inscrever-se</button>
  </form>
</footer>

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>