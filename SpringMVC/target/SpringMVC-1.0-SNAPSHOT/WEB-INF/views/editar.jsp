<%-- 
    Document   : editar
    Created on : 11/06/2020, 05:42:42 PM
    Author     : ANGEL
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
          
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Venta de registro</title>
    </head>
    <body>
        <h1>Editar - Productor</h1>
        
        <form:form name=" " method="post" modelAttribute="productor">
           
            Codigo:<form:input type="text" path="codigo" readonly="true"/><br>
            
            Nombre:<form:input type="text" path="nombre"/><br>
            Sexo:
            <form:select path="sexo">
                <form:option value="M">Masculino</form:option>
                <form:option value="F">Femenino</form:option>   
            </form:select><br>
            Horas de trabajo:<form:input type="number" path="horasTrabajo"/><br>
            Sueldo:<form:input type="number" path="sueldo"/><br><br>
            
            <button type="submit">Guardar</button>
            <button type="button" onclick="location.href='<c:url value="/listar"/>'">Cancelar</button>
                        
        </form:form>>
    </body>
</html>
