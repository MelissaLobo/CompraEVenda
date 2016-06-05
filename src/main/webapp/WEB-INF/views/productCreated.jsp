<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Produto Criado Com Sucesso!</title>
</head>
<body>
	<jsp:include page="template.jsp" />
	<div class="container">

		<div class="row">
			<h1>Lista de Produtos</h1>

			<div class="col-md-9">
				<div class="listProduct">
					<div class="row">
						<c:forEach items="${listProduct}" var="listProduct">
							<div class="col-sm-4 col-lg-4 col-md-4">
								<div class="thumbnail">
									<img class="img-responsive" src="" alt="">
									<div class="caption">
										<h4>
											<a href="#">${listProduct.productName}</a>
										</h4>
										<div class="caption">
											<h4 class="pull-right">${listProduct.price}<span class="glyphicon glyphicon-usd" />
											</h4>
										</div>
										<div class="ratings">
											<p>
												<a href="${listProduct.id}" class="btn btn-primary"
													role="button"> <span class="glyphicon glyphicon-plus" />
													<span class="glyphicon glyphicon-shopping-cart" /></a> <a
													href="${listProduct.id}" class="btn btn-default"
													role="button">Descrição do Produto: </a>
											</p>
											<span class="glyphicon glyphicon-star"></span>
											<p class="pull-right">Comentarios</p>
										</div>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>