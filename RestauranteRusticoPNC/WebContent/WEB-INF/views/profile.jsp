<%@ page language="java" contentType="text/html; 
charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<input type="button" value="Nuevo empleado" onclick="location.href='${pageContext.request.contextPath}/ne?cbr=${sucursal.pk_codsucursal}'"> <br>
	<div>          
  		<table>
    		<thead>
      			<tr>
        			<th>Nombre</th>
        			<th>Edad</th>
        			<th>Genero</th>
        			<th>Estado</th>
        			<th>Accion</th>
      			</tr>
    		</thead>
    	<tbody>
        		<c:forEach items="${empleados}" var="empleados">
        			<tr>
        				<td>${empleados.nombre}</td>
        				<td>${empleados.edad}</td>
        				<td>${empleados.genero}</td>
        				<td>${empleados.estadoDelegate}</td>
        				<td>
        				<div>
  							<input type="button" value="Editar" onclick="location.href='${pageContext.request.contextPath}/ee?cbr=${empleados.pk_codempleado}&cb=${sucursal.pk_codsucursal}'"/>
  							<input type="button"  value="Eliminar" onclick="del('${empleados.pk_codempleado}','${pageContext.request.contextPath}')"/>
						</div>
        				</td>	
        			</tr>
        		</c:forEach>
    	</tbody>
  		</table>
  	</div>
<script type='text/javascript'>
function del(c,f) {
  var box = confirm("Quieres eliminar esto?")
  var a = ${sucursal.pk_codsucursal}
  if(box == true){
	  var local = "http://localhost:8080/"
	  var url = local.concat(f,"/dele?cbr=",c,"&cb=",a)
	  location.href = url
  }
}
</script>
</body>
</html>