<%-- 
    Document   : index
    Created on : 20 mar 2025, 17:56:48
    Author     : SaulMansilla
--%>
<!-- Agregamos una declaracion de un JSP -->

<%!

    // Declaramos una variable y su metodo get asociado
    private String usurio = "Saul";
    
    public String getUsuario(){
        return this.usurio;
    }

    //Declaramos un contador de visitas
    private int contadorVisitas = 1;

%>

<%!
    // Declaramos una variable con scriptlet
    String nombre = "Juan";
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaraciones en un JSP</title>
    </head>
    <body>
        <h1>Declaraciones en un JSP!</h1>
        <p>Valor usuario por medio del atributo: <%=this.usurio%></p>
        <br/>
        <p>Valor usuario por medio del metodo: <%=this.getUsuario()%></p>
        <br/>
        <p>Contador de visitas: <%=this.contadorVisitas++ %></p>
    </body>
</html>
