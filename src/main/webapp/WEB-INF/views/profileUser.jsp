<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina do Usario</title>
</head>
<body>
<jsp:include page="template.jsp"/>
<p>${user.userName}</p>


	<div id="navbar" class="navbar-collapse collapse">
	    <ul class="nav navbar-nav navbar-light">
	     <li><a href="/newProduct">Novo Produto</a></li>
	     <li><a href="/newAdress">Adicionar Endereço</a></li>
	     <li><a href="/catalogUser">Seus Produtos</a></li>
	    </ul>
	</div>
</body>
</html>