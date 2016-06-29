<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contato da Empresa</title>
<style type="text/css">
.container img {
	max-width: 200px;
	max-height: 250px;
	width: auto;
	height: auto;
}
</style>

</head>
<body>
	<jsp:include page="template.jsp" />
	<div class="container">
		<div class="row">
			<h1>Produtos por Categoria:</h1>

			<div class="col-md-9">

				<div class="row">
					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<img class="img-responsive" src="images/ANTIGUIDADES.jpg" alt="">
							<p>Sabe aquele radio antigo, aquele vinil, o vestido de
								bolinhas, tudo isso você pode vender aqui</p>
							<p>
								<a href="#" class="btn btn-primary">ANTIGUIDADES</a>
							</p>
						</div>
					</div>
					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<img src="images/BELEZA.png" alt="">
							<p>Descrição</p>
							<p>
								<a href="#" class="btn btn-primary">BELEZA</a>
							</p>
						</div>
					</div>
					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<img src="images/CASA.jpg" alt="">
							<p>Descrição</p>
							<p>
								<a href="#" class="btn btn-primary">CASA</a>
							</p>
						</div>
					</div>
					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<img src="images/ELETRO.png" alt="">
							<p>Descrição</p>
							<p>
								<a href="#" class="btn btn-primary">ELETRO</a>
							</p>
						</div>
					</div>
					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<img src="images/ESPORTE.jpg" alt="">
							<p>Descrição</p>
							<p>
								<a href="#" class="btn btn-primary">ESPORTE</a>
							</p>
						</div>
					</div>
					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<img src="images/MODA.jpg" alt="">
							<p>Descrição</p>
							<p>
								<a href="#" class="btn btn-primary">MODA</a>
							</p>
						</div>
					</div>
					<div class="col-sm-4 col-lg-4 col-md-4">
						<div class="thumbnail">
							<img src="images/OUTROS.png" alt="">
							<p>Descrição</p>
							<p>
								<a href="#" class="btn btn-primary">OUTROS</a>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>