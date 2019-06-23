<%@ page language="java" contentType="text/html; 
charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#F5B582;">
	<font color="#808000">BIENVENIDO</font><br>
	<form action="${pageContext.request.contextPath}/login" method="post">
		User name: <br>
		<input type="text" name="usuario"><br>
		Password: <br>
		<input type="password" name="clave"><br>
		<input type="submit" value="Login">
	</form>
	<script type='text/javascript'>
	   	$("#login").on('submit', function (e) {
			e.preventDefault();
			$.ajax(
				{
					url: "${pageContext.request.contextPath}/login",
					data:  $("#login").serialize(),
					type: 'POST', 
					success: function (result) {
						location.href = "${pageContext.request.contextPath}/sucursales"
					},
					error: function (result) {
						swal("Usuario o contraseña inválido", {
				 	    	icon: "error",
		 		   		});
					}
				});
		});
    </script>
</body>
</html>