<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Bienvenido al inventario</h1><br>
		
		<h2>Introduce tus credenciales</h2>
		<form method="post">
		<input type="text" name="userid" placeholder="User ID" /> <br> <br>
		<input type="text" name="password" placeholder="Password" /> <br><br>
		<button>Entrar </button>
		</form>
		<h2>${errorMsg}</h2>
</body>
</html>