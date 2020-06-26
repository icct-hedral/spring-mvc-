<%-- 
    Document   : listar
    Created on : 06/06/2020, 02:57:50 PM
    Author     : ANGEL
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LISTADO</title>
    </head>
    <body>
        <h1>LISTA DE PRODUCTORES</h1>
        
        <a href="<c:url value="/welcome"/>">pagina de inicio</a>
        <a href="<c:url value="/registrar"/>">registrar nuevo</a><br><br>

        <table>
            
            <tr>
                <td><b>CODIGO</b></td>
                <td><b>Nombre</b></td>
                <td><b>Sexo</b></td>
                <td><b>Horas de trabajo</b></td>
                <td><b>Sueldo</b></td>
                <td><b>Acción</b></td>
            </tr>
            
            <c:forEach var="productor" items="${bProductores}">
                <tr>
                    <td>${productor.codigo}</td>
                    <td>${productor.nombre}</td>
                    <td>${productor.sexo}</td>
                    <td>${productor.horasTrabajo}</td>
                    <td>${productor.sueldo}</td>
                    <td>
                        <a href="<c:url value='/editar/${productor.codigo}'/>">editar</a>
                        <a href="<c:url value='/borrar/${productor.codigo}'/>">Eliminar</a>
                    </td>
               
                </tr>
            </c:forEach>
                 
        </table>
    </body>
</html>
