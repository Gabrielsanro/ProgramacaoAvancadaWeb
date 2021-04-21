<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversão</title>
</head>
<body>
<form:form method="POST" modelAttribute="dinheiro">
		<h2>Formulario de Conversão</h2>
		<br/>
		<h3>Informe o valor a ser convertido.</h3>
		<p>Valor $ : <form:input path="dinheiro"/> </p>
		<p><span><form:button>Conversão</form:button></span></p>
		<p>${mensagem}</p>
	</form:form>	

</body>
</html>