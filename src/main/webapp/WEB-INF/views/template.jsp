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
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		
		<link href="css/bootstrap.min.css" rel="stylesheet">
 		<link href="css/style.css" rel="stylesheet">

	</head>
<body>

 <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
   <div class="navbar-header">
	   <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	     <span class="sr-only">Toggle navigation</span>
	     <span class="icon-bar"></span>
	     <span class="icon-bar"></span>
	     <span class="icon-bar"></span>
	    </button>
		  <a class="navbar-brand" href="/">Compra e Venda </a>
	</div>
	<div id="navbar" class="navbar-collapse collapse">
	    <ul class="nav navbar-nav navbar-right">
	     <li><a href="/">Início</a></li>
	     <li><a href="#">Categorias</a></li>
	     <li><a href="#">Sua Loja</a></li>
	     <li><a href="#">Carrinho</a></li>
	     <li><a href="<c:url value="/logout" />">Logout</a></li>
	     
		 <li><a href="newAccount" style="margin-right: 5px;" class="btn btn-sm btn-success active navbar-right offset" role="button">Nova conta</a></li>
		</ul>
	</div>
  </div>
 </nav>
	
	<div><br><br><br>
	</div>
		
		<script src="js/jquery.min.js"></script>
 		<script src="js/bootstrap.min.js"></script>
</body>
</html>