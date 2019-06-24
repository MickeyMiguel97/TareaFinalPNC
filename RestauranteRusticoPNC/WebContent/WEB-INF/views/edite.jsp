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
<form:form  action="${pageContext.request.contextPath}/editar?cbr=${sucursal.pk_codsucursal}" method="POST" modelAttribute="empleado">
		<form:input type="hidden" name="pk_codempleado" path="pk_codempleado"/>
		<label>Nombre: </label>
		<form:input type="text" name="nombre" path="nombre"/><br>
		
		<label>Edad: </label>
		<form:input type="number" name="edad" path="edad"/><br>
		
		<label>Genero: </label>
		<form:input type="text" name="genero" path="genero"/><br>
		
		<label>Estado: </label><br>
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