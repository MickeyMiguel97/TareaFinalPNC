<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Agregar empleado</h1><br>

<form:form  action="${pageContext.request.contextPath}/newE?cbr=${sucursal.pk_codempleado}" method="POST" modelAttribute="empleado">
		<label>Name: </label>
		<form:input type="text" name="nombre" path="nombre"/><br>
		
		<label>Age: </label>
		<form:input type="number" name="edad" path="edad"/><br>
		
		<label>Gender: </label>
		<form:input type="text" name="genero" path="genero"/><br>
		
		<label>Status: </label><br>
		<div>
		<form:radiobutton name="status" path="estado" value="true"/><label>Active</label><br>
		</div>
		<div>
		<form:radiobutton name="status" path="estado" value="false"/><label>Inactive</label><br>
		</div>
		
		<input type="submit" value="Guardar"><br> 
	</form:form>
</body>
</html>