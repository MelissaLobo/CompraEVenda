<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html xmlns:ui="http://java.sun.com/jsf/facelets">
	<!--Informacoes da Pagina -->
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<title>Bootstrap Login Form</title>
		<meta name="generator" content="Bootply" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link href="template.html" rel="stylesheet">
		<link href="css/bootstrap.min.css" rel="stylesheet">
 		<link href="css/style.css" rel="stylesheet">
	</head>

<body>
  <div class="wrapper">
  
    <form class="form-signin" action="<c:url value='j_spring_security_check' />"
method='POST'>       
      <h2 class="form-signin-heading">Faça seu Login</h2>
      <input type="text" class="form-control" name="j_email" placeholder="Email Address"  />
      <input type="password" class="form-control" name="j_password" placeholder="Password" />      
      <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
      </label>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>  
      <span class="pull-right"><a href="/newAccount">Cadastre-se</a></span> 
    </form>
  </div>

	<!-- script references -->
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
	</body>
</html>