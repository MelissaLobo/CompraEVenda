<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Carrinho de Compras</title>
</head>
<body>


	<table class="table ">
		<thead>
			<tr>
				<td class="text-muted"><b>Name</b></td>
				<td class="text-muted"><b>Short Description</b></td>
				<td class="text-muted"><b>Code</b></td>
				<td class="text-muted"><b>Price</b></td>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${Cart.items}" var="item">

				<tr>
					<td class="item-title">${item.product.productName }</td>
					<td class="numeric-cell">${item.price }</td>
					<td class="quantity-input-cell"><input type="number" min="0"
						id="quantidade" name="quantidade"
						value="${cart.getQuantidade(item) }"></td>
					<td class="numeric-cell">${cart.getTotal(item) }</td>
					<td class="remove-item">
					</td>
				</tr>
			</c:forEach>

		</tbody>
      <tfoot>
       <tr>
          <td class="numeric-cell">${carrinhoCompras.total }</td>
          <td></td>
        </tr>
      </tfoot>
    </table>

</body>
</html>