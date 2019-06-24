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
<h2 id="prueba">Listado</h2> <input type="button" value="Nueva Sucursal" onclick="location.href='${pageContext.request.contextPath}/n'"> <br>
	<div>          
  		<table>
    		<thead>
      			<tr>
        			<th>Nombre</th>
        			<th>Gerente</th>
        			<th>Num. mesas</th>
        			<th>Ubicacion</th>
        			<th>Horario in</th>
        			<th>Horario out</th>
        			<th>Accion</th>
      			</tr>
    		</thead>
    	<tbody>
        		<c:forEach items="${sucursales}" var="sucursales">
        			<tr>
        				<td>${sucursales.nombre}</td>
        				<td>${sucursales.gerente}</td>
        				<td>${sucursales.nmesas}</td>
        				<td>${sucursales.ubicacion}</td>
        				<td>${sucursales.horarioin}</td>
        				<td>${sucursales.horarioout}</td>
        				<td>
        				<div>
  							<input type="button" value="Ver" onclick="location.href='${pageContext.request.contextPath}/view?cbr=${sucursales.pk_codsucursal}'"/>
  							<input type="button" value="Editar" onclick="location.href='${pageContext.request.contextPath}/e?cbr=${sucursales.pk_codsucursal}'"/>
  							<input type="button" value="Borrar" onclick="del('${sucursales.pk_codsucursal}','${pageContext.request.contextPath}')"/>
						</div>
        				</td>	
        			</tr>
        		</c:forEach>
    	</tbody>
  		</table>
  	</div>
<script type='text/javascript'>
function del(c,f) {
  var box = confirm("Quieres eliminar esto?");
  if(box == true){
	  var local = "http://localhost:8080/"
	  var url = local.concat(f,"/del?cbr=",c);
	  location.href = url;
  }
}
</script>
</body>
</html>