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

	<form id="teste" class="form-signin" action="/createShop" method="POST">
		<h1>Nova Conta</h1>
		Nome da sua Loja: <input type="text" class="form-control" name="nameShop"> 
		<br>
		
		<input name="submit" type="submit" value="Criar Loja"
					class="btn btn-lg btn-primary btn-block" />
	</form>
</body>
</html>