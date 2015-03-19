<%-- 
    Document   : index
    Created on : 19-mar-2015, 19:42:10
    Author     : edisonarango
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cuadrado M&aacute;gico</title>
        <link rel="stylesheet" href="Estilos.css"/>
    </head>
    <body>
        <center>
        <br><br><br><br>
        <form method="get" action="EcuacionSegundoGrado">           
            <div style="border: 1px solid;width: 178px;border-color: #DCDCDC;">
            <input class="cuadrado" type="text" name="0">
            <input class="cuadrado" type="text" name="1">
            <input class="cuadrado" type="text" name="2">
            <br>
            <input class="cuadrado" type="text" name="3">
            <input class="cuadrado" type="text" name="4">
            <input class="cuadrado" type="text" name="5">
            <br>
            <input class="cuadrado" type="text" name="6">
            <input class="cuadrado" type="text" name="7">
            <input class="cuadrado" type="text" name="8">
            <br>
            </div>
            <input type="submit" value="Verificar">
            <input type="submit" onclick="borrar()" value="Borrar">
        </form>
        <button onclick="borrar()">Borrar</button>
        <iframe style="width: 920px;height: 55px" id="frameVerificacion"></iframe>
    </center>
    </body>
</html>
