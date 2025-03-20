<%-- 
    Document   : scriptlets
    Created on : 20 mar 2025, 17:04:35
    Author     : SaulMansilla
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <!-- Scriptlet para enviar informacion al navegador -->
        <%
            out.println("Saludos desde un Scriptlet");
        %>
        <br>
        <!-- Scriptlet para acceder a los objetos implicitos -->
        <%
            String nombreAplicacion = request.getContextPath();
            out.println("Nombre de la aplicacion: " + nombreAplicacion);
        %>
         <br/>
        <!-- Scriptlet con codigo condicionado -->
        <%
            if (session != null && session.isNew()){
        %>
        la sesion SI es nueva
        <%
            } else if (session != null){
        %>
        la sesion NO es nueva
        <% } %>
        <br>
        <a href="index.html">Regresar al Inicio</a>
    </body>
</html>
