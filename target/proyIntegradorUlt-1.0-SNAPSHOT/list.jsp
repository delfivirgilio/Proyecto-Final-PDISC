


<%-- 
    Document   : list
    Created on : 11 oct 2023, 10:57:17
    Author     : virgi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <link rel="stylesheet" href="estilos.css"/>
    </head>
    
    <body id="fondo">
        <div id="divTitulo">
            <h1 id="titulo">Stock de productos <img id="icono"src="imagenes/camion.png" alt="camion"/></h1>
        </div>
        <div id="divTabla">
            <a class="btn btn-primary" id="ingreso" href="stockSERVLET?accion=nuevo"><h5>Ingresar nuevo producto</h5></a>
        <table id="tabla "class="table table-bordered table-secondary">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Codigo</th>
                    <th>Marca</th>
                    <th>Producto</th>
                    <th>Precio</th>
                    <th>Stock</th>
                    <th>Vendidos</th>
                    <th>Acciones</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach var="stock" items="${list}">
                <tr>
                    
                    <td><c:out value="${stock.id}"></c:out>1</td>
                    <td><c:out value="${stock.codigo}"></c:out>fdw</td>
                    <td><c:out value="${stock.marca}"></c:out>dfld</td>
                    <td><c:out value="${stock.producto}"></c:out>lklk</td>
                    <td><c:out value="${stock.precio}"></c:out>dkdkdk</td>
                    <td><c:out value="${stock.stockL}"></c:out>djdj</td>
                    <td><c:out value="${stock.vendidos}"></c:out>dddjjd</td>
                    <td><button class="btn btn-outline-warning">DESTACAR</button><button class="btn btn-outline-danger">ELIMINAR</button></td>
                </tr>
                </c:forEach>
            </tbody>
        </table></div>
        

        
    </body>
</html>
