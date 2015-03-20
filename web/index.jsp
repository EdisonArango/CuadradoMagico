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
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script> 
        <title>Cuadrado M&aacute;gico</title>
        <link rel="stylesheet" href="Estilos.css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    </head>
    <body>
        <center>
        <br><br><br><br>
        <form method="get" action="VerificarCuadrado" target="frameVerificacion">           
            <div style="border: 1px solid;width: 160px;border-color: #DCDCDC;">
                <input class="cuadrado solo-numero" type="text" maxlength="1" name="0">
                <input class="cuadrado solo-numero" type="text" maxlength="1" name="1">
                <input class="cuadrado solo-numero" type="text" maxlength="1" name="2">
                <br>
                <input class="cuadrado solo-numero" type="text" maxlength="1" name="3">
                <input class="cuadrado solo-numero" type="text" maxlength="1"name="4">
                <input class="cuadrado solo-numero" type="text" maxlength="1" name="5">
                <br>
                <input class="cuadrado solo-numero" type="text" maxlength="1" name="6">
                <input class="cuadrado solo-numero" type="text" maxlength="1" name="7">
                <input class="cuadrado solo-numero" type="text" maxlength="1" name="8">
                <br>
                </div>
            <br>
                <input type="submit" value="Verificar">
                
        </form>
        <button onclick="borrar()">Borrar</button>
        <br>
        <iframe style="width: 920px;height: 55px" id="frameVerificacion"></iframe>
    </center>
    
    <script>
        $(document).ready(function (){
          $('.solo-numero').keyup(function (){
            this.value = (this.value + '').replace(/[^0-9]/g, '');
          });
        });
        
        function borrar() {
            $(".cuadrado").val('');
        }
    </script>
    </body>
</html>
