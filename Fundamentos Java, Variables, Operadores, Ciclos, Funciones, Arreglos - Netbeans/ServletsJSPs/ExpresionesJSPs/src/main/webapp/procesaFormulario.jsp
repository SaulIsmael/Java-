<%-- 
    Document   : procesaFormulario
    Created on : 20 mar 2025, 16:23:35
    Author     : SaulMansilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesa Formulario</title>
    </head>
    <body>
        <h1>Resultado de Procesar el Formulario!</h1>
        Usuario: <%= request.getParameter("usuario") %>
        <br/>
        Password: <%= request.getParameter("password") %>
        <br/><br/>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
