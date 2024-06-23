<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*"%>
    <%@page import="model.TblProductocl2"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Productos</title>
</head>
<body>
<h1 align="center">Listado de Productos registrados en la BD</h1>

<table>
<td>ID<td>
<td>Nombre<td>
<td>Descripcion<td>
<td>Precio de Compra<td>
<td>Precio de Venta<td>
<td>Estado<td>
</table>
<% List<TblProductocl2> listadoProductos=(List<TblProductocl2>)request.getAttribute("listadoProductos");
//Condicion
if (listadoProductos != null) {
	//Bucle for
	for(TblProductocl2 lis:listadoProductos) {
		%>	
		<tr>
		<td><%=lis.getIdproductocl2()%><td>
		<td><%=lis.getNombrecl2()%><td>
		<td><%=lis.getDescripcl2()%><td>
		<td><%=lis.getPreciocompcl2()%><td>
		<td><%=lis.getPrecioventacl2()%><td>
		<td><%=lis.getEstadocl2()%><td>
		<tr>	
<%	}
}
%>
</body>
</html>