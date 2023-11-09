<%-- 
    Document   : formProducto
    Created on : 26 oct 2023, 19:02:22
    Author     : virgi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="estilos.css"/>        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body id="fondo">
        <div id="divTitulo">
            <h1 id="titulo"> Formulario Producto</h1>
        </div>
        <div id="contenedor">
            <div id="divForm">
            <form action="stockSERVLET" method="post">
            <p>
                Codigo <br>
                <input type="text" name="nombre">
            </p>
            <p>
                Marca<br>
                <input type="text" name="marca"><br/>
            </p>
            <p>
                Producto<br>
                <input type="text" name="producto"><br/>
            </p>
            <p>
                Precio<br>
                <input type="text" name="precio"><br/>
            </p>
            <p>
                Stock<br>
                <input type="text" name="stockL"><br/>
            </p>
            <p>
                Vendidos<br>
                <input type="text" name="vendidos"><br/>
            </p>
            <p>
                <input type="submit" value="Guardar" id="boton" class="btn">
            </p>
            
            
        </form>
        </div>
        </div>
        
        
    </body>
</html>
