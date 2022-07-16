<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- <link rel="stylesheet" href="css/bananaStyle.css"> -->

<meta charset="ISO-8859-1">
<title>Cadastro Produto</title>
</head>
<body>
	<nav class="nav">
		<ul>
			<li><span style="color: yellow">Teste</span></li>
			
			<li><a href="cadastrarProduto.jsp">Cadastrar Produto</a></li>
			<!--  <li><a href="consultarProduto.jsp">Consultar Produto</a></li>-->
		</ul>
	</nav>
	<main class="produtoMain">
		<form action="produtoCadastrado" method="post" class="produtoForm">
			<div>
				<label><strong>Nome:</strong></label><input type="text" name="nome">
			</div>
			<div>
				<label><strong>Quantidade:</strong></label><input type="text" name="quantidade">
			</div>
			<div>
				<label><strong>Preço:</strong></label><input type="text" name="preco">
			</div>

			<label><strong>Ativo:</strong></label><input type="checkbox" name="ativo">
			<br>
			<div>
				<input id="cadastrarButton" type="submit" name="salvar"
					value="Cadastrar Produto">
			</div>
		</form>
	</main>
</body>
</html>