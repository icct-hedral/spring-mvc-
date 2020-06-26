<%-- 
    Document   : borrar
    Created on : 18/06/2020, 12:58:53 PM
    Author     : ANGEL
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>borrar</title>
    </head>
    <body>
        <h1>Borrar productor</h1>
        
        <form:form name=" " method="post" modelAttribute="productor">
           
            Codigo:<form:input type="text" path="codigo" readonly="true"/><br>
            Nombre:<form:input type="text" path="nombre" readonly="true"/><br>
            
            <p>¿Estas seguro de borrar?</p>
            
            <button type="submit">Si</button>
            <button type="button" onclick="location.href='<c:url value="/listar"/>'">Cancelar</button>
            

            
        </form:form>>
    </body>
</html>
