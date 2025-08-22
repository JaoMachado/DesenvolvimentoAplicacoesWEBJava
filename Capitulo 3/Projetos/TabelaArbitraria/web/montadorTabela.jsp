<%-- 
    Document   : montadorTabela
    Created on : 22 de ago. de 2025, 09:21:23
    Author     : João Pedro Machado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Montador de Tabela</title>
        
        <style>
            .tabela {
                border-collapse: collapse;
                
            }
  
            td{
                padding: 8px;
                border: 1px solid #ddd;
            }
            
            tr:hover {
                background-color: #f9f9f9;
            }
            
            h2{
                background-color: #f9f9f9;
                padding: 10px;
            }
        </style>
        
    </head>
    <body>
        <h1>Tabela: </h1>
        <c:choose>
            <c:when test="${(param.linhas gt 0) and (param.colunas gt 0)}">
               <table class="tabela">
                   <c:forEach begin="1" end="${param.linhas}" varStatus="i">
                       <tr>
                           <c:forEach begin="1" end="${param.colunas}" varStatus="j">
                               <td>${param.texto}</td>
                           </c:forEach> 
                       </tr>
                   </c:forEach> 
               </table>
            </c:when>
            <c:otherwise>
               <h2>Número de Linhas ou Número de Colunas Inválido!!</h2>
            </c:otherwise>  
        </c:choose>
        
        
    </body>
</html>
