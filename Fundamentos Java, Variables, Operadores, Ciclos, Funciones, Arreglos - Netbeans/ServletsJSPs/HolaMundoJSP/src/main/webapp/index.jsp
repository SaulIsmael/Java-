<%-- 
    Document   : index
    Created on : 20 mar 2025, 14:47:06
    Author     : SaulMansilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola Mundo JSPs</title>
    </head>
    <body>
        <h1>Hola Mundo JSPs!</h1>
        <ul>
            <li><% out.println("Hola mundo con Scriptlets");%></li>
            <li>${"Hola Mundo con Expression Language (EL)"}</li>
            <li><%="Hola Mundo con Expresiones"%></li>
            <li><c:out value="Hola Mundo con JSTL"/></li>
        </ul>
    </body>
</html>
