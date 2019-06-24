<%@ page language="java" contentType="text/html; 
charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#F5B582;">
	<font color="#808000">BIENVENIDO</font><br>
	<form:form action="${pageContext.request.contextPath}/login" modelAttribute="usuario" method="post" >
		User name: <br>
		<form:input type="text" name="nombre" path="nombre"/><br>
		Password: <br>
		<form:input type="password" name="clave" path="clave"/><br>
		<input type="submit" value="Login">
	</form:form>
</body>
</html>