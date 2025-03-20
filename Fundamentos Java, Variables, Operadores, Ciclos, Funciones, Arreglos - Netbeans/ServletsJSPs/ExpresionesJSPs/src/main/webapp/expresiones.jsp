<%-- 
    Document   : expresiones
    Created on : 20 mar 2025, 16:13:39
    Author     : SaulMansilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <h1>JSPs con Expresiones!</h1>
        Concatenacion: <%= "Saludos" + " " + "desde un JSPs" %>
        <br/>
        Operaciones Matematica: <%= 2 * 3 / 2 %> 
        <br/>
        Id de la sesion: <%= session.getId()%>
        <br/><br/>
        <a href="index.html">Regresar al inicio</a>        
    </body>
</html>
