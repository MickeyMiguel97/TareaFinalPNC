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
<form:form  action="${pageContext.request.contextPath}/edits" method="POST" modelAttribute="sucursal">

		<form:input type="hidden" name="pk_codsucursal" path="pk_codsucursal"/>
		
		<label>Nombre: </label>
		<form:input type="text" name="nombre" path="nombre"/><br>
		
		<label>Gerente: </label>
		<form:input type="text" name="gerente" path="gerente"/><br>
		
		<label>Numero de mesas: </label>
		<form:input type="number" name="nmesas" path="nmesas"/><br>
		
		<label>Ubicacion: </label>
		<form:input type="text" name="ubicacion" path="ubicacion"/><br>
		
		<label>Abierto desde: </label>
		<form:input type="text" name="horarioin" path="horarioin"/><br>
		
		<label>Cerrado a las: </label>
		<form:input type="text" name="horarioout" path="horarioout"/><br>
		
		<input type="submit" value="Guardar"><br> 
	</form:form>
</body>
</html>