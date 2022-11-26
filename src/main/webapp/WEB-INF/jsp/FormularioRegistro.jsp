<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario IMC</title>
</head>
<body>
	<h1>Base de datos IMC</h1>
	<h2>Inserta tus datos</h2>
	<form th:action= "@{/save}" th:object={$registro} method="post">
		<H2>Ingresa tu peso</H2>
		<input th:field="*{Id}"  type="text" name="Id" placeholder="Peso" /> <br> <br>
		<H2>Ingresa tu peso</H2>
		<input th:field="*{Peso}"  type="text" name="Peso" placeholder="Peso" /> <br> <br>
		<H2>Ingresa tu Altura</H2>
		<input th:field="*{Altura}" type="text" name="Altura" placeholder="Altura" /> <br><br>
	<button th:field="*{Usuario}" = "Lunka"> Calcular </button>
</body>
</html>